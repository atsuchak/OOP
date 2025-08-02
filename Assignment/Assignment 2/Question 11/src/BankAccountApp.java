import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BankAccountApp extends GUI{

    public static void main(String[] args) {
        GUI obj = new GUI();

        File file = new File("src\\accounts.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            try {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(",");
                    String name = parts[0];
//                    if(obj.accTf == name) {
//                        obj.Jlabel
//                    }
                    System.out.println("Name: " +name);
                    String ACC = parts[1];
                    System.out.println("Account: " +ACC);
                    int balance = Integer.parseInt(parts[2]);
                    System.out.println("Banalce: " +balance);
                    int lstTransaction = Integer.parseInt(parts[3]);
                    System.out.println("Last Transaction: " +lstTransaction);
                    String transactionType = parts[4];
                    System.out.println("Transaction type: " +transactionType);
                }
            }finally {
                br.close();
                System.out.println("File read successfully");
            }
        }catch (Exception ioe) {
            ioe.printStackTrace();
        }

    }

}
