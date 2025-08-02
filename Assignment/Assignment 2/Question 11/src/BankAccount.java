public class BankAccount {
    private String AccountName;
    private String AccountNumber;
    private double Balance;
    private double LastTransaction;
    private String LastTransactionType;

    BankAccount(String AccountName, String AccountNumber, double Balance, double LastTransaction, String LastTransactionType) {
         this.AccountName = AccountName;
         this.AccountNumber = AccountNumber;
         this.Balance = Balance;
         this.LastTransaction = LastTransaction;
         this.LastTransactionType = LastTransactionType;
    }

    public String getAccountName() {
        return AccountName;
    }
    public void setAccountName(String accountName) {
        AccountName = accountName;
    }
    public String getAccountNumber() {
        return AccountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }
    public double getBalance() {
        return Balance;
    }
    public void setBalance(double balance) {
        Balance = balance;
    }
    public double getLastTransaction() {
        return LastTransaction;
    }
    public void setLastTransaction(double lastTransaction) {
        LastTransaction = lastTransaction;
    }
    public String getLastTransactionType() {
        return LastTransactionType;
    }
    public void setLastTransactionType(String lastTransactionType) {
        LastTransactionType = lastTransactionType;
    }
}
