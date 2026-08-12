
class addition {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(int a, double b) {
        return a + b;
    }
}

class methodOverloading {

    public static void main(String[] args) {
        addition a1 = new addition();
        System.out.println(a1.add(1, 2));
        System.out.println(a1.add(1, 2.5));

    }
}
