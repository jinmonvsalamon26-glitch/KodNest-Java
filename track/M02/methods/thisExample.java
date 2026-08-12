
class Student {

    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

class thisExample {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.input("suriya", 22, 5.10);
        s1.display();
    }
}
