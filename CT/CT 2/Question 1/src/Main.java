import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bwOdd = null;
        BufferedWriter bwEven = null;
        try {
            File idFile = new File("src\\id.txt");
            File oddFile = new File("src\\odd.txt");
            File evenFile = new File("src\\even.txt");

             br = new BufferedReader(new FileReader(idFile));
             bwOdd = new BufferedWriter(new FileWriter(oddFile));
             bwEven = new BufferedWriter(new FileWriter(evenFile));

            String line;

            while ((line = br.readLine()) != null) {
                int id = Integer.parseInt(line);
                if(id % 2 == 0) {
                    bwEven.write(String.valueOf(id));
                    bwEven.newLine();
                }
                else {
                    bwOdd.write(String.valueOf(id));
                    bwOdd.newLine();
                }
            }
        }catch (Exception e) {
            System.out.println("Exception found: " +e);
        }finally {
            try {
                if(br != null) br.close();
                if(bwEven != null) bwEven.close();
                if(bwOdd != null) bwOdd.close();
                System.out.println("File read write successfully");
            }catch (Exception ioe) {
                System.out.println("Exception found: " +ioe);
            }
        }
    }
}
