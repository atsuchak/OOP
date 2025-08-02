package Problem10;

import java.util.Scanner;

public class Main extends AddressBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AddressBook obj = new AddressBook();
        boolean loop = true;
        while (loop) {
            System.out.println();
            System.out.println("1. Add contact");
            System.out.println("2. Remove contact");
            System.out.println("3. Display contact");
            System.out.println("4. Search contact");
            System.out.println("5. Exit");
            System.out.println();
            System.out.print("Choose(1/2/3/4/5): ");
            int choice = sc.nextInt();
            sc.nextLine();
            String name;

            switch (choice) {
                case 1:
                    System.out.print("Enter contact name: ");
                    name = sc.nextLine();
                    obj.addContact(name);
                    break;
                case 2:
                    System.out.print("Enter contact name: ");
                    obj.name = sc.nextLine();
                    obj.removeContact(obj.name);
                    break;
                case 3:
                    obj.displayContact();
                    break;
                case 4:
                    System.out.print("Enter contact name: ");
                    obj.name = sc.nextLine();
                    obj.searchContact(obj.name);
                    break;
                case 5:
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

    }
}
