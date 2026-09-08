
import java.util.Scanner;

public class CheckIdenticalArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }

        int size1 = scanner.nextInt();
        int arr1[] = new int[size1];
        for (int i = 0; i <= arr1.length - 1; i++) {
            arr1[i] = scanner.nextInt();
        }

        if (size != size1) {
            System.out.println(0);
            return;
        }

        boolean iden = true;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] != arr1[i]) {
                iden = false;
                break;
            }
        }

        if (iden) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        scanner.close();
    }
}
