package Week6.task1;

public class Square extends Expression {
    private Expression expression;
    public Square(Expression expression) {
        this.expression = expression;
    }

    public Square() {
    }

    @Override
    public String toString() {
        return "Square{" +
                "expression=" + expression +
                '}';
    }

    @Override
    public double evaluate() {
        return 0;
    }
}
