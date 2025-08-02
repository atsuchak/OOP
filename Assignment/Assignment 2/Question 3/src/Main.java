import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        File file = new File("src\\person.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            try {
                String line;
                int maxAge = 0;
                String maxAgeLine = null;
                
                while((line = br.readLine()) != null) {
                    String[] parts = line.split("/");
                    int age = Integer.parseInt(parts[1]);
                    if(age > maxAge) {
                        maxAge = age;
                        maxAgeLine = line;
                    }
                }
                System.out.println(maxAgeLine);
            }finally {
                br.close();
                System.out.println("File read successfully");
            }
        }catch (Exception ioe) {
            System.out.println("Exception: " + ioe);
        }
    }
}
