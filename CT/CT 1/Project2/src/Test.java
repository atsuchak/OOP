import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

//        Library lib1 = new Library();
//
//        Library lib2 = new Library(1, "City Library");
//
//        Book book1 = new Book(2, "Central Library", "Java Programming");
//
//        Member member1 = new Member();
//
//        Member member2 = new Member(3, "Community Library", 101, "John Doe");
//
//        lib1.display();
//        System.out.println();
//
//        lib2.display();
//        System.out.println();
//
//        book1.display();
//        System.out.println();
//
//        member1.display();
//        System.out.println();
//
//        member2.display();


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        if(name == " ") {
            System.out.print("Write your name");
        }else {
            for(int i = 1; i <= 100; i++) {
                System.out.println(i+". " +name+" okay");
            }
        }


    }
}
