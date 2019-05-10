package Project;

import java.util.ArrayList;
import java.util.List;

public class Person {

    public static final String Admin = "Admin";
    public static final String User = "User";

    private String login;
    private String password;
    private String role;

    private Products products = new Products();

    public Person(String login, String password) {
        this.login = login;
        this.password = password;
        this.role = User;
    }

    public Person(String login, String password, String role) {
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAdmin() {
        return this.role.equals(Admin);
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void printBacket() {
        this.products.print();
    }

    @Override
    public String toString() {
        return "Person{" +
                "login='" + login + '\'' +
                ", password='" + password + '}';
    }
}