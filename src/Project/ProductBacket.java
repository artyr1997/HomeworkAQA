package Project;


import java.util.ArrayList;
import java.util.List;


public class ProductBacket {

    private List<Product> products = new ArrayList<>();
    private String category;
    private String product;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public ProductBacket(String category, String product) {
        this.category = category;
        this.product = product;
    }
    public void addProduct(Product product){
        this.products.add(product);
    }
    public void removeProduct(Product product){
        this.products.remove(product);
    }


    @Override
    public String toString() {
        return "ProductBacket{" +
                "category='" + category + '\'' +
                ", product='" + product + '\'' +
                '}';
    }

}