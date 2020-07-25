import Week3.Task1.Week3Task1;
import Week3.Task2.Fraction;
import Week4.Week4;

public class Main {

    public static void main(String[] args) {
        Week3Task1 week3Task1 = new Week3Task1();
        System.out.println("running");
        week3Task1.gcd(22, 44);
        System.out.println(week3Task1.fibonaci(6));
        week3Task1.sieveEratosthenes(34);
        Fraction fraction1 = new Fraction(5, 4);
        Fraction fraction2 = new Fraction(5, 4);
        fraction1.multiply(fraction2);
        Week4 week4 = new Week4();
        week4.max2Int(5, 5);
    }
}
