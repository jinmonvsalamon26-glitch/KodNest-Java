
class mobile {

    int password;

    void unlock(int password) {
        this.password = password;
    }

    public class Mobile {

        public static void main(String[] args) {
            mobile s1 = new mobile();
            s1.unlock(1234);
        }
    }
}
