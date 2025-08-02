package Problem10;

public class AddressBook {
    String name;
    String[] contactNameList = new String[100];
    int contactNameCount = 0;

    public void addContact(String contact_name){
       for(int i = 0; i < contactNameCount; i++) {
           if(contactNameList[i].equals(contact_name)) {
               System.out.println("Contact name already exist");
               return;
           }
       }
        contactNameList[contactNameCount] = contact_name;
        contactNameCount++;
        System.out.println("Contact name added successfully");
    }
    void removeContact(String contact_name) {
        this.name = contact_name;
        for(int i = 0; i < contactNameCount; i++) {
            if(contactNameList[i].equals(contact_name)) {
                for(int j = i; j < contactNameCount-1; j++) {
                    contactNameList[j] = contactNameList[j+1];
                }
                contactNameList[contactNameCount-1] = null;
                contactNameCount--;
                System.out.println("Contact removed successfully");
                return;
            }
        }
    }
    void displayContact() {
        for (int i = 0; i < contactNameCount; i++) {
            System.out.println((i+1) + ". " + contactNameList[i]);
        }
    }

    void searchContact(String contact_name) {
        for (int i = 0; i < contactNameCount; i++) {
            if (contactNameList[i].equals(contact_name)) {
                System.out.println(contact_name);
            } else {
                System.out.println("Contact not found");
            }
        }
    }
}
