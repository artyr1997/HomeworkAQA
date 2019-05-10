package Project;

import java.util.ArrayList;
import java.util.List;

public class Products {

    private List<Product> products = new ArrayList<>();

    public Product get(int index) {
        return this.products.get(index);
    }

    public void add(Product product) {
        this.products.add(product);
    }

    public boolean has(int index){
        return products.size() > index;
    }

    public void searchProduct(String search) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(search)) {
                System.out.print("Your products: ");
                System.out.print(i);
                System.out.println("-" + products.get(i));
            }

        }

        System.out.println("Product not found");
    }

    public void print() {
        for (int i = 0; i < products.size(); i++) {
            System.out.print(i);
            System.out.println(". " + products.get(i));
        }
    }

}

