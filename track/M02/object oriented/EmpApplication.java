
class Employee {

    int empID;
    String empName;
    double salary;

    void working() {
        System.out.println("Employee is working");
    }
}

class EmpApplication {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.empID = 1;
        e1.empName = "suriya";
        System.out.println(e1.empID);
        System.out.println(e1.empName);
        e1.working();
        Employee e2;
        e2 = e1;
        e2.empID = 5;
        e2.empName = "jin";
        System.out.println(e2.empID);
        System.out.println(e2.empName);
        System.out.println(e2.empID);
        System.out.println(e2.empName);
        e2.working();
    }
}
