package td.edu.util;

public class Calc {
	
	public int addToNumber(int num) {
		int result = 0;
		for(int i=1; i<=num; i++) {
			result += i;
		}
		return result;
	}
	
	public void printCal(int num, int result) {
		System.out.println("1~"+num+" 사이의 정수 : "+result);
	}
	
}
