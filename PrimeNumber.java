package week1.day1;

public class PrimeNumber {

public static void main(String[] args) {
	int input = 13;
	if(input==0 || input==1) {
		System.out.println(input+" is not a Prime Number");
	}
		boolean flag = true;
		for(int i=2; i<=input/2; i++) {
		if(input%i == 0) {
			System.out.println(input+" is not a Prime Number");
		flag = false;
		break;
		}
		}
		if(flag) {
			System.out.println(input+" is a Prime Number");
		}
}

}