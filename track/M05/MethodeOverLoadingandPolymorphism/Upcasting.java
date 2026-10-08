
class Developer {

    void work() {
        System.out.println("Developer working");
    }

    void project() {
        System.out.println("Developer doing project");
    }
}

public class JavaDeveloper extends Developer {

    void work() {
        System.out.println("JavaDeveloper Working");
    }

    void project() {
        System.out.println("JavaDeveloper doing project");
    }
}

public class PythonDeveloper extends Developer {

    void work() {
        System.out.println("PythonDeveloper working");
    }

    void project() {
        System.out.println("PythonDeveloper doing project");
    }
}

public class Upcasting {

    public static void main(String[] args) {
        Developer jd = new Developer();
        accessMethod(jd);
        Developer pd = new PythonDeveloper();
        accessMethod(pd);
    }

    public static void accessMethod(Developer dev) {
        dev.work();
        dev.project();
    }
}
