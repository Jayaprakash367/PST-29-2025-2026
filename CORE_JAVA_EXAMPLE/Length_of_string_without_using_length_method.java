package Java_program;
import java.util.Scanner;
public class Length_of_string_without_using_length_method {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String str = sc.next();
		int count = 0;
		for (char c : str.toCharArray()) {
			count++;
		}

		System.out.println("The length of the string is: " + count);

	}

}
