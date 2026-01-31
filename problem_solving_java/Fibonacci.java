import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int n = sc.nextInt();
        int first = 0, second = 1, next;

        System.out.print("Fibonacci Series up to " + n + ": ");

        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                next = i;
            } else {
                next = first + second;
                first = second;
                second = next;
            }
            System.out.print(next + " ");
        }
    }
}





