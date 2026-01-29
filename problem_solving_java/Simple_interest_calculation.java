package Core_java_program;
import java.util.Scanner;
public class Simple_interest_calculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of p:");
		int P=sc.nextInt();
		System.out.println("Enter the value of R:");
		int R=sc.nextInt();
		System.out.println("Enter the value of T:");
		int T=sc.nextInt();
		int SI=(P*R*T)/100;
		System.out.println("Simple Interest is: "+SI);

	}

}
