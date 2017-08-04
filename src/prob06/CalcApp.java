package prob06;

import java.util.Scanner;

public class CalcApp {
	
	static Arithmetic calcObj = null;
	
	public static Arithmetic operation(String[] formulaArray) {
		
		int firstOperand = Integer.parseInt(formulaArray[0]);
		int secondOperand = Integer.parseInt(formulaArray[2]);
		String operator = formulaArray[1];
		
		switch (operator) {
		
			case "+":
				calcObj = new Add();	break;
			case "-":
				calcObj = new Sub();	break;
			case "*":
				calcObj = new Mul();	break;
			case "/":
				calcObj = new Div();	break;
	
			default:					break;
		}
		
		calcObj.setValue(firstOperand, secondOperand);
		
		return calcObj;	
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			
			System.out.print(">> ");
			
			String formula = scanner.nextLine();
			if("quit".equals(formula)) {
				break;
			}
			String[] formulaArray = formula.split(" ");
			
			calcObj = CalcApp.operation(formulaArray);
			
			if(calcObj == null){
				continue;
			}
			else{
				System.out.println(">> "+calcObj.calculate());
			}
		}
		
		scanner.close();
	}
}
