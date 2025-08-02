import java.io.*;

public class Main {
    public static void main(String[] args) {
        File idFile = new File("src\\id.txt");
        File oddFile = new File("src\\odd.txt");
        File evenFile = new File("src\\even.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(idFile));
            BufferedWriter bwOdd = new BufferedWriter(new FileWriter(oddFile));
            BufferedWriter bwEven = new BufferedWriter(new FileWriter(evenFile));
            try {
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
            }finally {
                br.close();
                bwEven.close();
                bwOdd.close();
                System.out.println("Id sorted successfully");
            }
        }catch (Exception ioe) {
            ioe.printStackTrace();
        }
    }
}
