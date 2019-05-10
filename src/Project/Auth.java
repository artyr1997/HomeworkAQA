package Project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Auth {

    public Person login(Scanner sc){

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("test@kindgeek.com", "qwerty"));
        persons.add(new Person("admin@kindgeek.com", "qwerty", Person.Admin));

        System.out.println("Enter your login");
        String login = sc.next();
        System.out.println("Enter your password");
        String password = sc.next();
        Person currentPerson = null;
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Person personFromIterator = iterator.next();
            if (personFromIterator.getLogin().equals(login) && personFromIterator.getPassword().equals(password)) {
                currentPerson = personFromIterator;
                break;
            }
        }
        if (currentPerson != null) {
            return currentPerson;
        }
        else {
            throw new RuntimeException("Ures with this login and password not found");
        }

    }
}