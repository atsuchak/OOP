import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File("src\\e.txt");
        File file2 = new File("src\\f.txt");

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            BufferedReader br = new BufferedReader(new FileReader(file));
            BufferedWriter bw2 = new BufferedWriter(new FileWriter(file2));
            try {
                for(int i = 0; i < 5; i++) {
                    System.out.println("String " +(i+1)+ ": ");
                    String st = sc.nextLine();
                    bw.write(st);
                    bw.newLine();
                }
                bw.close();

                String line;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(" ");
                    for(String st: parts) {
                        bw2.write(st);
                        bw2.newLine();
                    }
                }
            }finally {
                br.close();
                bw2.close();
                System.out.println("File closed successfully");
            }
        }catch (Exception ioe) {
            ioe.printStackTrace();
        }
    }
}
