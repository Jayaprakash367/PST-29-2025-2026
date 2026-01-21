package SCANNER;
import java.util.Scanner;
public class Sum_Average_example {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the Size of the element:");
		    int a=sc.nextInt();
			int arr[] = new int[a];
			System.out.println("Enter the numbers:");
			int Sum = 0;
			for (int i = 0; i < a; i++) {
				System.out.print("Element " + (i + 1) + ": ");
				arr[i] = sc.nextInt();
				Sum += arr[i];
			}

			System.out.println("Sum of the elements: " + Sum);
			System.out.println("Average of the elements: " + ((double) Sum / a));
			sc.close();
	}
}

