package Test;

import java.util.LinkedList;
import java.util.List;

public class TypeProduct {

    private String nameCategory;

    private List<Product> products = new LinkedList<>();

    public TypeProduct(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Product addProduct(Product product){
        products.add(product);
        return product;
    }

    @Override
    public String toString() {
        return "____" + nameCategory + "____:" + " " +
                products;
    }

}
