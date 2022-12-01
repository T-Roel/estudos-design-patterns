package org.troel.strategy.calc.strategies;

public class AdditionOperation implements OperationStrategy {

	@Override
	public int calculate(int numOne, int numTwo) {
		return numOne + numTwo;
	}
}
