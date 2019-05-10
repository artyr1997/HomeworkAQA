package Project;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Auth auth = new Auth();
        Menu menu = new Menu();

        Category firstCategoryInstrument = new Category("Guitar");
        Category secondCategoryInstrument = new Category("Piano");
        Category threeCategoryInstrument = new Category("Dump");

        Categories categories = new Categories();
        categories.add(firstCategoryInstrument);
        categories.add(secondCategoryInstrument);
        categories.add(threeCategoryInstrument);

        Products products = new Products();
        products.add(new Product("Gibson", firstCategoryInstrument));
        products.add(new Product("Yamaha", secondCategoryInstrument));
        products.add(new Product("Loss", threeCategoryInstrument));

        Scanner sc = new Scanner(System.in);
        Person currentPerson;
        currentPerson = auth.login(sc);

        boolean status = true;
        while (status) {
            menu.print(currentPerson);
            int key = sc.nextInt();
            clearScreen();
            if (currentPerson.isAdmin()){
                switch (key)
                {
                    case 1: {
                        System.out.println("All products");
                        products.print();
                        break;
                    }
                    case 2: {
                        System.out.print("Add category.");
                        System.out.println("Enter category name:");
                        String name = sc.next();
                        categories.add(new Category(name));
                        break;
                    }
                    case 3: {

                        System.out.println("Add product. Enter product name:");
                        String name = sc.next();
                        System.out.println("Enter category:");
                        categories.print();
                        Integer categoryId = sc.nextInt();

                        if (categories.has(categoryId)) {
                            Category category = categories.get(categoryId);
                            products.add(new Product(name, category));
                        } else {
                            System.out.println("Category not found");
                        }
                        break;
                    }
                    case 4: {
                        System.out.println("You Log outed from the system");
                        status = false;
                        break;
                    }
                }
            }
            else {
                switch (key)
                {
                    case 1: {
                        System.out.println("See all Product");

                        products.print();

                        break;
                    }
                    case 2: {
                        System.out.print("Search: ");
                        String search = sc.next();
                        products.searchProduct(search);
                        break;
                    }
                    case 3: {
                        System.out.println("Sort Products");
                        break;
                    }
                    case 4: {
                        System.out.println("Add to backet");

                        products.print();

                        int productId = sc.nextInt();

                        if (products.has(productId)) {
                            currentPerson.addProduct(products.get(productId));
                        } else {
                            System.out.println("Products not found");
                        }

                        break;
                    }
                    case 5: {
                        currentPerson.printBacket();

                        break;
                    }
                    case 6: {
                        System.out.println("Log out from system");
                        status = false;
                        break;
                    }
                }
            }

        }

    }
    public static void clearScreen() {
        System.out.flush();
    }

}