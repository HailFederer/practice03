package prob06;

import java.util.Scanner;

public class CalcApp {
	
	static Arithmetic calcObj = null;
	
	public static Arithmetic operation(String operator) {
		
		switch (operator) {
		
		case "+":
			calcObj = new Add();
			break;
		case "-":
			calcObj = new Sub();
			break;
		case "*":
			calcObj = new Mul();
			break;
		case "/":
			calcObj = new Div();
			break;

		default:
			break;
		}
		
		return calcObj;	
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			
			System.out.print(">> ");
			
			String str = scanner.nextLine();
			if(str.equals("quit"))
				break;
			String[] operatorArray = str.split(" ");
			int firstOperand = Integer.parseInt(operatorArray[0]);
			int secondOperand = Integer.parseInt(operatorArray[2]);
			String operator = operatorArray[1];
			
			calcObj = CalcApp.operation(operator);
			
			if(calcObj == null){
				continue;
			}
			else{
				calcObj.setValue(firstOperand, secondOperand);
			}
			
			System.out.println(">> "+calcObj.calculate());
		}
		
		scanner.close();
	}
}
