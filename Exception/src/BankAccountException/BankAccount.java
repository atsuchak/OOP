package BankAccountException;

import java.util.Scanner;

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String st) {
        super(st);
    }
}

public class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void withdraw(double amount) {
        try {
            if(amount > this.balance) throw new InsufficientFundsException("Withdraw amount is greater than the main balance");
            else {
                System.out.println("Withdraw amount: " +amount);
                this.balance -= amount;
                System.out.println("Balance after withdraw: " +this.balance);
            }
        }catch (InsufficientFundsException e) {
            System.out.println("Exception found: " +e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount obj = new BankAccount("ACC1001", 500);

        try {
            System.out.println("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            obj.withdraw(amount);
        }catch (Exception e) {
            System.out.println("Exception found: " +e);
        }
    }
}
