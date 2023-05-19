package ProductCRUD;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {

        while (true)
        {
            System.out.println("1:ADD BOOK\n2:DISPLAY BOOK\n3:DELETE BOOK");
            Scanner sc=new Scanner(System.in);
            int choice= sc.nextInt();
            DAOProduct daoProduct=new DAOProduct();
            switch (choice)
            {
                case 1:
                    System.out.println("ENTER BOOK ID");
                    int id= sc.nextInt();

                    System.out.println("ENTER BOOK_NAME");
                    String name= sc.next();

                    System.out.println("ENTER BOOK_PRICE");
                    double price=sc.nextDouble();

                    daoProduct.addProduct(id,name,price);
            }
        }
    }

}
