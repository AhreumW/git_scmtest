package td.edu;

import java.util.Scanner;

import td.edu.util.Calc;

public class GitConstructMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 두 개를 입력해주세요.(양수)");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		Calc calc = new Calc();
		int result1 = calc.addToNumber(num1);
		int result2 = calc.addToNumber(num2);
		
		calc.printCal(num1, result1);
		calc.printCal(num2, result2);
		
	}

}
