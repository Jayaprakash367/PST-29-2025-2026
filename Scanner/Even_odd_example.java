package SCANNER;
import java.util.Scanner;
public class Even_odd_example {

	public static void main(String[] args) {
		
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the Size of the element:");
    int a=sc.nextInt();
    sc.nextLine();
    int arr[]=new int[a];
    System.out.println("Enter the number:");
    for(int i=0;i<a;i++) {
    	arr[i]=sc.nextInt();}
    for(int i=0;i<=a;i++) {
          if(arr[i]%2==0) {
        	 
        	  System.out.println("The Given number is even:"+i);
          }
          else {
       
        	  System.out.println("The given number is odd:"+i);
          }
	}

}
}
