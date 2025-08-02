import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        ArrayList<Character> ch = new ArrayList<>();

        for(char c: st.toCharArray()) {
            ch.add(c);
        }

        if(ch.size() > 2) ch.set(2, 'z');
        System.out.println(ch);
    }
}
