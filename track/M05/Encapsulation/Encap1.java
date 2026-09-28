
public class Book {

    private int pageNum;

    public void setData(int x) {
        pageNum = x;

    }

    public int getData() {
        return (pageNum);
    }
}

public class Encap1 {

    public static void main(String[] args) {

        Book b = new Book();
        b.setData(10);
        b.getData();
    }
}
