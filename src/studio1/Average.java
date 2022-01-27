package studio1;

import support.cse131.ArgsProcessor;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int number1 = ap.nextInt("Input an integer");
		int number2 = ap.nextInt("Input an integer");
		double average = (number1 + number2)/2.0;
		System.out.println("This is the average: " + average);
	}

}
