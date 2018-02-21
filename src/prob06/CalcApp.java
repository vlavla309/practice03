package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while( true ) {
			System.out.print(">> ");
			String input=scanner.nextLine().trim();

			if(input.equals("quit")) {
				break;
			}
			String[] ts=input.split(" ");

			Arithmetic arith=null;
			switch(ts[1]) {
			case "+":
				arith=new Add();
				break;
			case "-":
				arith=new Sub();
				break;
			case "*":
				arith=new Mul();
				break;
			case "/":
				arith=new Div();
				break;

			}
			arith.setValue(Integer.parseInt(ts[0]), Integer.parseInt(ts[2]));
			int result=arith.calculate();
			System.out.println(">> "+result);
		}

		scanner.close();

	}

}
