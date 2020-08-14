package exam06;
import exam06.proj.cal.*;

import exam06.add.Adder;


public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calc = new Calculator();
		System.out.println(calc.addNum(10, 20));
		System.out.println(calc.addNum(10, 20));
		System.out.println(calc.subNum(30, 15));
		
		calc.showOperationTimes();
		
		Adder adder = new Adder();
		System.out.println(adder.addTwoNumber(20,30));
	}

}
