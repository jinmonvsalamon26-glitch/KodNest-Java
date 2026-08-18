
import java.util.Scanner;

public class sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            sum = sum + a[i];
        }
        System.out.println("Sum of Array Elements : " + sum);
    }
}
