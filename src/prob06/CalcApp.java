package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Arithmetic calcObj = null;
		
		while( true ) {
			
			System.out.print(">> ");
			
			String str = scanner.nextLine();
			if(str.equals("quit"))
				break;
			String[] strArr = str.split(" ");
			
			switch (strArr[1]) {
			
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
			
			if(calcObj == null){
				continue;
			}
			else{
				calcObj.setValue(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[2]));
			}
			
			System.out.println(">> "+calcObj.calculate());
			
			scanner.close();
		}
	}
}
