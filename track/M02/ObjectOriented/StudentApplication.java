
class Student {

    int roll;
    String name;
    double height;

    void run() {
        System.out.println("running");
    }

    void sleeping() {
        System.out.println("sleeping");
    }
}

class StudentApplication {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 1;
        s1.name = "suriya";
        s1.height = 5.10;
        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.height);
        s1.run();
        s1.sleeping();

    }
}
