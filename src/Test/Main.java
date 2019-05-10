package Test;

import java.util.*;

public class Main {

    static String loginPass, loginUser;
    static Scanner sc = new Scanner(System.in);

    static boolean login = true;
    static boolean checkvalid = false;


    public static void main(String[] args) {

        String userLogin = "test@kindgeek.com";
        String userPassword = "qwerty";
        String adminLogin = "admin@kindgeek.com";
        String adminPassword = "qwerty";

        Map<TypeProduct, Product> product = new HashMap<>();
        product.put(new TypeProduct("Guitar"), null);
        product.put(new TypeProduct("Piano"), null);

        List<Backet> backet = new ArrayList<>();

        System.out.println("Hello, please log in.\n");
        while (login) {
            checkvalid = false;
            System.out.println(" ------------------ \n" + "Username: \n");
            loginUser = sc.nextLine();
            System.out.println("Password: \n");
            loginPass = sc.nextLine();

            if (loginUser.equals(userLogin) && loginPass.equals(userPassword)) {
                checkvalid = true;
                System.out.println("You have logged in as User.");
                Scanner sc = new Scanner(System.in);
                boolean status = true;
                while (status) {
                    System.out.println(" ------------------ \n" +
                            "1 - See all Categories \n" +
                            "2 - Sorting Category \n" +
                            "3 - Searsh Category \n" +
                            "4 - See all added products to Backet\n" +
                            "5 - Add Category to Backet\n" +
                            "6 - Log Out\n");
                    int key = sc.nextInt();
                    switch (key) {
                        case 1: {
                            product.keySet().iterator()
                                    .forEachRemaining(System.out::println);
                            break;
                        }
                        case 2: {
                            System.out.println("1 - Sorting by \n" +
                                    "2 - Sorting Category \n");
                            System.out.println(product.keySet().iterator().next().getProducts());
                            break;
                        }
                        case 3: {
                            System.out.println("Found some product");
                            searchOnlyForCategory(sc, product);
                            break;
                        }
                        case 4: {
                            break;
                        }
                        case 5: {
                            System.out.println("Add Some Product to Backet");
                            addProductToBacket(sc, product);
                            break;
                        }
                        case 6: {
                            System.out.println("Log Out");
                            status = false;
                            break;
                        }
                    }
            }
            }
            else if (loginUser.equals(adminLogin) && loginPass.equals(adminPassword)) {
                checkvalid = true;
                System.out.println("You have logged in as Admin");
                Scanner sc = new Scanner(System.in);
                boolean status = true;
                while (status) {
                    System.out.println(" ------------------ \n" +
                            "1 - See all Categories \n" +
                            "2 - Add Category \n" +
                            "3 - Add Product to Category\n" +
                            "4 - Log out\n");
                    int key = sc.nextInt();
                    switch (key) {
                        case 1: {
                            System.out.println("CATEGORY");
                            product.keySet().iterator()
                                    .forEachRemaining(System.out::println);
                            break;
                        }
                        case 2: {
                            System.out.println("Add new Category");
                            String Name = sc.next();
                            product.put(new TypeProduct(Name), null);
                            break;
                        }
                        case 3: {
                            addProdictToCategory(sc, product);
                            break;
                        }
                        case 4: {
                            System.out.println("Log out");
                            status = false;
                            break;
                        }
                    }
                }
            }
            else {
                checkvalid = false;
                System.out.println("Incorrect username or password");
            }
        }
    }

    private static void addProdictToCategory(Scanner sc, Map<TypeProduct, Product> persons) {
        System.out.println("Enter name of Category");
        String fName = sc.next();
        TypeProduct currentPerson = null;

        Iterator<Map.Entry<TypeProduct, Product>> iterator = persons.entrySet().iterator();
        while (iterator.hasNext()) {

            TypeProduct personFromIterator = iterator.next().getKey();
            if (personFromIterator.getNameCategory().equals(fName)) {
                currentPerson = personFromIterator;
                break;
            }
        }

        System.out.println("Enter number of Instrument");
        int number = sc.nextInt();
        System.out.println("Enter material of Instrument");
        String material = sc.next();
        System.out.println("Enter color of Instrument");
        String color = sc.next();
        System.out.println("Enter TYPE of Instrument");
        Instrument instrument = Instrument.getInstrument(sc.next());
        if (currentPerson != null) {
            currentPerson.addProduct(new Product(instrument, number, material, color));
        } else {
            throw new RuntimeException("Internet with with Type not found");
        }
    }

    private static void addProductToBacket(Scanner sc, Map<TypeProduct, Product> persons) {
        System.out.println("Enter name of Category");
        String fName = sc.next();
        System.out.println("Enter color of Product");
        String iColor = sc.next();
        TypeProduct currentPerson = null;

        Iterator<Map.Entry<TypeProduct, Product>> iterator = persons.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<TypeProduct, Product> entry = iterator.next();
            TypeProduct personFromIterator = entry.getKey();
            if(personFromIterator.getNameCategory().equals(fName)){
                Product product = entry.getValue();
                System.out.println(product);
                System.out.println(product.getColor());
                if(product.getColor().equals(iColor)){
                    System.out.println("COOOL");

                }
            }

        }
    }
    private static void searchOnlyForCategory(Scanner sc, Map<TypeProduct, Product> persons) {

        System.out.println("Enter name of Category");
        String fName = sc.next();

        System.out.println("Enter material of Product");
        String iMaterial = sc.next();

        TypeProduct currentPerson = null;
        Iterator<Map.Entry<TypeProduct, Product>> iterator = persons.entrySet().iterator();
        while (iterator.hasNext()) {
            TypeProduct personFromIterator = iterator.next().getKey();
            TypeProduct personFromIterator1 = iterator.next().getKey();
            if (personFromIterator.getNameCategory().equals(fName) && iterator.next().getKey().getProducts().iterator().next().getMaterial().equals(iMaterial)) {
                System.out.println(personFromIterator.getProducts());
                break;
            }
        }
    }

}
