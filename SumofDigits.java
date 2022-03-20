package week1.day1;

public class SumofDigits {

	public static void main(String[] args) {
		int input = 544;
		int sum = 0;
		
		while (input > 0) {
		int reminder = input%10;
		input = input/10;
		sum = sum + reminder;
				}
		System.out.println("Sum of Digits is " + sum);
	}

}
