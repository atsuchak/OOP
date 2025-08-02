import java.io.*;

public class Main {
    public static void main(String[] args) {
        File student = new File("src\\students.txt");
        File marks = new File("src\\marks.txt");
        File merge = new File("src\\merged.txt");

        try {
            BufferedReader stReader = new BufferedReader(new FileReader(student));
            BufferedReader mrkReader = new BufferedReader(new FileReader(marks));
            BufferedWriter mrgWritter = new BufferedWriter(new FileWriter(merge));

            try {
                String stLine, mrkLine;

                while ((stLine = stReader.readLine()) != null) {
                    mrkLine = mrkReader.readLine();
                    mrgWritter.write(stLine);
                    mrgWritter.write(" ");
                    String[] parts = mrkLine.split(" ");
                    mrgWritter.write(parts[1]);
                    mrgWritter.newLine();
                }

            }finally {
                stReader.close();
                mrkReader.close();
                mrgWritter.close();
                System.out.println("File merged successfully");
            }
        }catch (Exception ioe) {
            ioe.printStackTrace();
        }
    }
}
