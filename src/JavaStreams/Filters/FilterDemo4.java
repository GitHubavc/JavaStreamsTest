package JavaStreams.Filters;

import java.util.ArrayList;
import java.util.List;

class Product{
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class FilterDemo4 {
    public static void main(String[] args) {

        List<Product> productsList = new ArrayList<Product>();
        productsList.add(new Product(1,"HP laptop",25000));
        productsList.add(new Product(2,"Sony laptop",34000));
        productsList.add(new Product(3,"Lenovo laptop",44000));
        productsList.add(new Product(4,"Dell laptop",75000));
        productsList.add(new Product(5,"Apple laptop",123000));

        productsList.stream().filter(p->p.price>35000).forEach(pr-> System.out.println(pr.price));

    }
}
