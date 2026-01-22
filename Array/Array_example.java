package Array;
import java.util.Scanner;
public class Array_example {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.print("Enter the size of an elements:");
		int Size=Sc.nextInt();
		int arr[]=new int[Size];
		for(int i=0; i<Size;i++){
			System.out.println("Element"+(i+1));
			arr[i]=Sc.nextInt();
		}
		System.out.println("Array of the  elements:");
		for(int i=0;i<Size;i++) {
			System.out.print(arr[i]);
		}
      
	}

}
