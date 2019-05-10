package Project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Categories {

    private List<Category> categories = new ArrayList<>();

    public Category get(int index) {
        return this.categories.get(index);
    }

    public boolean has(int index){
        return categories.size() > index;
    }

    public void add(Category category) {
        this.categories.add(category);
    }

    public void print() {
        for (int i = 0; i < categories.size(); i++) {
            System.out.print(i);
            System.out.println(" - " + categories.get(i));
        }
    }

}

