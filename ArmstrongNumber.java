package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input = 134;
		int temp = input;
		//int sum = 0;
		int arm = 0;
		
		while (input > 0) {
		int reminder = input%10;
		input = input/10;
		//sum = sum + reminder;
		arm = arm + (reminder * reminder * reminder);
		}
		if (arm == temp)	{
			System.out.println(temp + " is a Armstrong Number");
		}
		else
		System.out.println(temp + " is not a Armstrong Number");
	}
}

//153 = ((1*1*1)+(5*5*5)+(3*3*3))
//1+125+27
//153

//152 = ((1*1*1)+(5*5*5)+(2*2*2))
//1+125+8
//134

//134 = ((1*1*1)+(3*3*3)+(4*4*4))
//1+9+64
//74