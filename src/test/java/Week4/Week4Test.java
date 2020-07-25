package Week4;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runners.model.TestClass;

import java.text.DecimalFormat;

public class Week4Test extends TestCase {
    private int a , b;
    private int[] arr1 = new int[100];
    private int[] arr2 = new int[200];
    private double IBM = 0.0;
    private double weight ;
    private double height ;
    private Week4 week4;

    @Test
    public void testMax2Int1() {
        a = 5;
        b = 5;
        week4 = new Week4();
        assertEquals("Success",5 ,week4.max2Int(a,b));
    }

    @Test
    public void testMax2Int2() {
        a = 7;
        b = 5;
        week4 = new Week4();
        assertEquals("a must more than b",7 ,week4.max2Int(a,b));
    }

    @Test
    public void testMax2Int3() {
        a = 5;
        b = 8;
        week4 = new Week4();
        assertEquals("b must more than a",8 ,week4.max2Int(a,b));
    }

    @Test
    public void testMax2Int4() {
        a = -5;
        b = -8;
        week4 = new Week4();
        assertEquals("a must more than b", -5, week4.max2Int(a,b));
    }

    @Test
    public void testMax2Int5() {
        a = -8;
        b = -5;
        week4 = new Week4();
        assertEquals("a must more than b", -5, week4.max2Int(a,b));
    }

    @Test
    public void testMinArray1(){
        arr1 = new int[]{1, 2 ,6 , 5, -2, 7};
        week4 = new Week4();
        assertEquals("Fail answer", -2, week4.minArray(arr1));
    }

    @Test
    public void testMinArray2(){
        arr2 = new int[]{1, 2 ,6 , 5, -2, 7};
        week4 = new Week4();
        assertEquals("Arr is ok", 0, week4.minArray(arr1));
    }

    @Test
    public void testMinArray3(){
        arr1 = new int[]{7,7,7,7,7};
        week4 = new Week4();
        assertEquals("Fail answer", 7, week4.minArray(arr1));
    }

    @Test
    public void testMinArray4(){
        arr1 = new int[]{};
        week4 = new Week4();
        assertEquals(0, week4.minArray(arr1));
    }

    @Test
    public void testMinArray5(){
        arr1 = new int[]{1};
        week4 = new Week4();
        assertEquals(1, week4.minArray(arr1));
    }

    @Test
    public void testCalculateBMI1(){
        weight = 45.2;
        height  = 1.3;
        week4 = new Week4();
        assertEquals("Fail answer","26.7", week4.caculateIBM(weight, height));
    }

    @Test
    public void testCalculateBMI2(){
        weight = 45.2;
        height  = 0;
        week4 = new Week4();
        assertEquals("Fail answer","Height and weight need to > 0", week4.caculateIBM(weight, height));
    }

    @Test
    public void testCalculateBMI3(){
        weight = 0;
        height  = 1.2;
        week4 = new Week4();
        assertEquals("Fail answer","Height and weight need to > 0", week4.caculateIBM(weight, height));
    }

    @Test
    public void testCalculateBMI4(){
        weight = 0;
        height  = 0;
        week4 = new Week4();
        assertEquals("Fail answer","Height and weight need to > 0", week4.caculateIBM(weight, height));
    }

    @Test
    public void testCalculateBMI5(){
        weight = 24;
        height  = 2;
        week4 = new Week4();
        assertEquals("Fail answer","6.0", week4.caculateIBM(weight, height));
    }

}
