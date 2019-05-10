package Project;

public class Menu {

    public void print(Person person ){
        if (person.isAdmin()){
            System.out.println("Choose from menu 1-4." + "\n"+
                    "1-See all product" + "\n" +
                    "2-Add new category" + "\n" +
                    "3-Add new product by category" + "\n" +
                    "4-Log out" );
        }
        else {
            System.out.println("Choose from menu 1-6." + "\n"+
                    "1-See all product." + "\n" +
                    "2-Search." + "\n" +
                    "3-Sort of Product" + "\n" +
                    "4-Add product to basket" + "\n" +
                    "5-Basket" + "\n" +
                    "6-Log out" );
        }

    }
}
