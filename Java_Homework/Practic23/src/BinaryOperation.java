abstract class BinaryOperation implements Expression {
    protected final Expression left, right;

    BinaryOperation(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}

class Const implements Expression {
    private final int value;
    public Const(int value) { this.value = value; }
    @Override public int evaluate(int x) { return value; }
}

class Variable implements Expression {
    @Override public int evaluate(int x) { return x; }
}

class Add extends BinaryOperation {
    Add(Expression left, Expression right) { super(left, right); }
    @Override public int evaluate(int x) { return left.evaluate(x) + right.evaluate(x); }
}

class Subtract extends BinaryOperation {
    Subtract(Expression left, Expression right) { super(left, right); }
    @Override public int evaluate(int x) { return left.evaluate(x) - right.evaluate(x); }
}

class Multiply extends BinaryOperation {
    Multiply(Expression left, Expression right) { super(left, right); }
    @Override public int evaluate(int x) { return left.evaluate(x) * right.evaluate(x); }
}

class Divide extends BinaryOperation {
    Divide(Expression left, Expression right) { super(left, right); }
    @Override public int evaluate(int x) {
        int r = right.evaluate(x);
        if (r == 0) throw new ArithmeticException("Division by zero");
        return left.evaluate(x) / r;
    }
}