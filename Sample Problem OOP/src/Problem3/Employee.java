package Problem3;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] name = new String[n];
        String[] id = new String[n];
        int[] salary = new int[n];
        for(int i = 0; i < n ; i++) {
            name[i] = sc.nextLine();
            id[i] = sc.next();
            salary[i] = sc.nextInt();
            sc.nextLine();
        }
        int count = 0;
        int maxSal = 0;
        for(int i = 0; i < n; i++) {
            if(salary[i] > 12000) {
                maxSal = salary[i];
                count++;
                for(int j = i+1; j < n; j++) {
                    if(maxSal < salary[j]) {
                        maxSal = salary[j];
                    }
                }
            }
        }
        System.out.println("Count: " + count);
        System.out.println("Max: " + maxSal);
    }
}
