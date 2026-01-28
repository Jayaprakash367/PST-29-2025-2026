package Java_program;
import java.util.Scanner;
public class Prime_num_check {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number :");
    int num=sc.nextInt();
   for(int i=2;i<=num-1;i++) {
       if(num%i==0) {
           System.out.println("The number is not prime");
           return;
       }
       else{
       System.out.println("The number is prime");
       }
       sc.close();
   }
}
}