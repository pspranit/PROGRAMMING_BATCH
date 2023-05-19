package ProductCRUD;

import java.util.ArrayList;

class DAOProduct{


    ArrayList<DTOProduct> products=new ArrayList<>();

    void addProduct(int id,String name,double price)
    {
        DTOProduct d1=new DTOProduct(id,name,price);
        products.add(d1);
        System.out.println("BOOK ADDED SUCCESSFULLY");
    }

}
