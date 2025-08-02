package Problem6;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        double[] arr = new double[size];
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextDouble();
        }
        double temp = 0;
        for(int i = 1; i < size-1; i+=2) {
            if(i+2 < size) {
                temp = arr[i];
                arr[i] = arr[i+2];
                arr[i+2] = temp;
            }
        }
        for(int i = 0; i < size; i++) {
            System.out.print((int)arr[i] + " ");
        }
    }
}
