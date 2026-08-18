
import java.util.Scanner;

public class Max {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scanner.nextInt();
        }
        int max = a[0];
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Maximum Element is : " + max);
    }
}
