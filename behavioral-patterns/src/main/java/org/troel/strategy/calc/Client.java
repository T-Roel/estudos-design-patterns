package org.troel.strategy.calc;

import org.troel.strategy.calc.strategies.AdditionOperation;
import org.troel.strategy.calc.strategies.DivisionOperation;
import org.troel.strategy.calc.strategies.MultiplicationOperation;
import org.troel.strategy.calc.strategies.SubtractionOperation;

public class Client {

	public static void main(String[] args) {
		Calculator calc = new Calculator(10, 2);
		System.out.println(calc.getResult(new AdditionOperation()));
		System.out.println(calc.getResult(new SubtractionOperation()));
		System.out.println(calc.getResult(new MultiplicationOperation()));
		System.out.println(calc.getResult(new DivisionOperation()));
	}
}
