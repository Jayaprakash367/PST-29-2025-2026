
public class greatest3num
{
	public static void main(String[] args) {
	   
        int a = 30, b = 55, c = 65;

        if (a >= b && a >= c) {
            System.out.println("Greatest number is: " + a);
        } 
        else if (b >= a && b >= c) {
            System.out.println("Greatest number is: " + b);
        } 
        else {
            System.out.println("Greatest number is: " + c);
        }
    }
}
