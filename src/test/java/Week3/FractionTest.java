package Week3;

import Week3.Task2.Fraction;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runners.model.TestClass;

public class FractionTest extends TestCase {
    private int d , n;
    private int d1, n1;
    private Fraction fraction;
    private Fraction fraction1;

    @Test
    public void testFractionReduce() {
        d = -10;
        n = 5;
        fraction = new Fraction(d, n);
        fraction1 = fraction.reduce(d, n);
        assertEquals("Not true",(fraction1.getDenominator() == -2 && fraction1.getNumerator() == 1), true );
    }

    public void testFractionAdd() {
        d = 10;
        n = 5;
        d1 = 7;
        n1 = 3;
        fraction = new Fraction(d, n);
        fraction1 = new Fraction(d1, n1);
        Fraction sum = fraction.add(fraction1);
        assertEquals("Not true",(sum.getDenominator() == 13 && sum.getNumerator() == 3), true );
    }

    public void testFractionSubtract() {
        d = 10;
        n = 5;
        d1 = 7;
        n1 = 3;
        fraction = new Fraction(d, n);
        fraction1 = new Fraction(d1, n1);
        Fraction sum = fraction.subtract(fraction1);
        assertEquals("Not true",(sum.getDenominator() == -1 && sum.getNumerator() == 3), true );
    }

    public void testFractionMutify() {
        d = 10;
        n = 5;
        d1 = 7;
        n1 = 3;
        fraction = new Fraction(d, n);
        fraction1 = new Fraction(d1, n1);
        Fraction sum = fraction.multiply(fraction1);
        assertEquals("Not true",(sum.getDenominator() == 14 && sum.getNumerator() == 3), true );
    }

    public void testFractionDivide() {
        d = 10;
        n = 5;
        d1 = 7;
        n1 = 3;
        fraction = new Fraction(d, n);
        fraction1 = new Fraction(d1, n1);
        Fraction sum = fraction.divide(fraction1);
        assertEquals("Not true",(sum.getDenominator() == 6 && sum.getNumerator() == 7), true );
    }
}
