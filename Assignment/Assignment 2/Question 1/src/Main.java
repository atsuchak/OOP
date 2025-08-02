import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        File fileEmployee = new File("src\\employee.txt");
        File fileIncrement = new File("src\\increment.txt");

        try {
            BufferedWriter bwEmployee = new BufferedWriter(new FileWriter(fileEmployee));

            BufferedReader brEmployee = new BufferedReader(new FileReader(fileEmployee));
            BufferedWriter bwIncrement = new BufferedWriter(new FileWriter(fileIncrement));

            try {
                System.out.println("Total employee:");
                int n = sc.nextInt();
                sc.nextLine();
                for(int i = 0; i < n; i++) {
                    System.out.println("Employee name:");
                    String name = sc.nextLine();
                    bwEmployee.write(name +"\n");
                    System.out.println("Employee ID:");
                    String id = sc.nextLine();
                    bwEmployee.write(id +"\n");
                    double[] performance = new double[6];
                    double avg = 0;
                    double sum = 0;
                    for(int j = 0; j < 6; j++) {
                        System.out.println("Employee performance:");
                        performance[j] = sc.nextDouble();
                        sc.nextLine();
                        sum += performance[j];
                    }
                    avg = sum/6;
                    bwEmployee.write(avg +"\n");
                }
            } finally {
                bwEmployee.close();
            }
            try {
                String name, id, average;

                while((name = brEmployee.readLine()) != null) {
                    id = brEmployee.readLine();
                    average = brEmployee.readLine();
                    double avg = Double.parseDouble(average);

                    if(avg > 75) {
                        bwIncrement.write(name);
                        bwIncrement.newLine();
                    }
                }
            }finally {
                bwIncrement.close();
                brEmployee.close();
                System.out.println("file read write successfully");
            }
        } catch (IOException ioe) {
            System.out.println("Exception found: " +ioe);
        }

    }
}
