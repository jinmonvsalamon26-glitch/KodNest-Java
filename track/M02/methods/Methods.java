
import java.util.Scanner;

class MethodDemo {

    void sayHello() {
        System.out.println("Hello from a method!");
    }

    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    int getLuckyNumber() {
        return 7;
    }

    int add(int first, int second) {
        return first + second;
    }
}

class Methods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        MethodDemo obj = new MethodDemo();
        obj.sayHello();
        obj.greet(name);
        int luckyNumber = obj.getLuckyNumber();
        System.out.println("Lucky_ Number:" + luckyNumber);
        int sum = obj.add(first, second);
        System.out.println("Sum is : " + sum);
    }
}
