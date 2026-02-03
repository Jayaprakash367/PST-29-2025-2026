package OOPs_Concept;
import java.util.Scanner;
public class Method_Example {
	public static void main(String[] args) {
		Method();
	}
	public static void Method() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the value of a:");
		int a=scanner.nextInt();
		System.out.print("Enter the value of a:");
		int b=scanner.nextInt();
		int sum=a+b;
		System.out.println("The Value of a and b is :"+sum);

}
}
