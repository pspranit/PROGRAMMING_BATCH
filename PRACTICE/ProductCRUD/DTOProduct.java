package ProductCRUD;

import java.util.ArrayList;

public class DTOProduct {

    private int book_id;
    private String book_name;
    private double book_price;

    public DTOProduct(int book_id, String book_name, double book_price) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_price = book_price;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public double getBook_price() {
        return book_price;
    }

    public void setBook_price(double book_price) {
        this.book_price = book_price;
    }

    @Override
    public String toString() {
        return "DAOProduct{" +
                "book_id=" + book_id +
                ", book_name='" + book_name + '\'' +
                ", book_price=" + book_price +
                '}';
    }
}
