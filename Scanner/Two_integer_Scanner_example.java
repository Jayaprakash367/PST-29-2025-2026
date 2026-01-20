import java.util.Scanner;
public class Two_integer_Scanner_example {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.print("Enter first integer: ");
      int num1=scan.nextInt();
      System.out.print("Enter second integer: ");
      int num2=scan.nextInt();
      int sum=num1+num2;
      int difference=num1-num2;
      int product=num1*num2;
      int Quotient=num1/num2;
      System.out.println("sum of two integer is"+sum); 
      System.out.println("difference of two integer is"+difference);
      System.out.println("product of two integer is"+product);
      System.out.println("Quotient of two integer is"+Quotient);
      scan.close();
    }
}