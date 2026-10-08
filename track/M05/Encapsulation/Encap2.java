
public class Book {

    private int pageNum;

    public void setData(int x) {
        if (x > 0) {
            pageNum = x;
        }

    }

    public int getData() {
        return (pageNum);
    }
}

public class Encap2 {

    public static void main(String[] args) {

        Book b = new Book();
        b.setData(10);
        b.getData();
    }
}
