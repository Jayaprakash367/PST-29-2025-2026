package Java_program;
import java.util.Scanner;
public class Char_count {
      public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.print("Enter the String :");
    	 String str=sc.next();
         int count=0;
         for(int i=0;i<str.length();i++) {
        	if(str.charAt(i)>='a'&& str.charAt(i)<='z' ) {
                 count++;}
         }System.out.println("Number of  letters :"+count);
}
}