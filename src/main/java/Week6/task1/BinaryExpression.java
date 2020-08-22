package Week6.task1;

public class BinaryExpression extends Expression {
    private Expression left;
    private Expression right;

    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public BinaryExpression() {
    }

    @Override
    public String toString() {
        return "BinaryExpression{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    @Override
    public double evaluate() {
        return 0;
    }
}
