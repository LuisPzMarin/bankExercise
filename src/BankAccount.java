package src;

public class BankAccount {
    private int accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(){

    }
    public BankAccount(String ownerName, int accountNumber, double balance){
        this.ownerName = ownerName;
        this.balance = balance;
        this.accountNumber =accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void showData(){
        System.out.println("El usuario es "+ ownerName);
        System.out.println("El número de cuenta es "+ accountNumber);
        System.out.println("El balance es "+ balance);
    }
}
