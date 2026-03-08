import java.util.ArrayList;
import java.util.ArrayList;


class Contact {
    String name;
    String phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Contact> contacts = new ArrayList<>();

        // Adding contacts directly in the code
        contacts.add(new Contact("Arun", "9876543210"));
        contacts.add(new Contact("Priya", "9123456789"));

        System.out.println("--- Contact List ---");

        for (Contact c : contacts) {
            c.display();
            System.out.println();
        }
    }
}