package Java_program;

import java.util.Scanner;

public class Digit_count_for_given_digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		System.out.println("Enter the digit to be counted:");
		int digit=sc.nextInt();
		int count=0;	
		while(number>0) {
			int rem=number%10;
			if(rem==digit) {
				count++;
			}
			number=number/10;
		}
		System.out.println("The count of digit "+digit+" is: "+count);
		sc.close();

	}

}
