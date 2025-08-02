public class Library {
    int id; //store the id of the library
    String name; //store name

    Library() {
//        System.out.println("Parent Library class- No value assigned");
    }

    Library(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Library ID: "+id);
        System.out.println("Library Name: "+name);
    }

}
