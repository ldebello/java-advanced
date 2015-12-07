package ar.com.javacuriosities.calculator.model;

public class MultiplicationExpression extends BinaryExpression {

	public MultiplicationExpression(Expression lhs, Expression rhs) {
		super(lhs, rhs);
	}

	@Override
	public Object evaluate() {
		Integer left = (Integer) lhs.evaluate();
		Integer right = (Integer) rhs.evaluate();
		return left * right;
	}
	
	@Override
	public String toString() {
		return lhs.toString() + " * " + rhs.toString();
	}
}