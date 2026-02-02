package Core_java_program;
import java.util.Scanner;

public class perfect_number_example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check perfect number:");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum +=  i;
            }
        }

        if (sum == num) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }

        sc.close();
    }
}
