package week1.day1;

public class PositiveOrNegative {

	public static void main(String[] args) {
		
		/*
Problem statement: Check if the number is positive or negative
---------------------------------------------------------------
Pseudocode:
----------
 1. Initialize a number, say, int number= 35;
 2. If a number is positive, print "The number is positive"
    If a number is negative, print "The number is negative"
    If it nether negative nor positive, print as "The number is neither positive nor negative"

		*/
		
		int number=34;
		if (number>0)
		{
			System.out.println(number+" - The number is positive");
		}
		else if (number<0)
		{
			System.out.println(number + " - The number is Negative");
		}
		else
		{
			System.out.println(number + " - The number is neither positive nor negative");
		}
		
			
			}

		}