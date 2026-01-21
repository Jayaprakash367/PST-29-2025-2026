package SCANNER;
import java.util.Scanner;
public class Vowel_consonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character:");
        String c=sc.next();
        
        if(c.equals("a")|| c.equals("e") || c.equals("i") || c.equals("o")|| c.equals("u")) {
        	System.out.println("the character is Vowel:"+c);
        }
        else {
        	System.out.println("the character is Consonent:"+c);
        }
        sc.close();
        
	}

}
