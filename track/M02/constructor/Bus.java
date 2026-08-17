
class Conductor {

    int collect(Money m) {
        System.out.println("Money collected by conductor");
        return m.amount;
    }

    class Ticket {

        String m;
        String b;

        Ticket() {
            m = "Mysuru";
            b = "Bangalore";
        }

    }

    class Money {

        int amount;

        Money(int amount) {
            this.amount = amount;
        }
    }

    Ticket give() {
        Ticket t = new Ticket();
        System.out.println("Ticket is given to passenger");
        return t;
    }
}

public class Bus {

    public static void main(String[] args) {
        Conductor c = new Conductor();
        Money m = new Conductor.Money(100);
        c.collect(m);
        Conductor.Ticket t = c.give();
        System.out.println(t.b);
    }
}
