package src;

public class main {
    public static void main(String[] args) {
        System.out.println("hola");
        BankAccount accountLuis = new BankAccount("Luis Perez", 23, 50);
        BankAccount accountDaniel = new BankAccount("Daniel", 25, 150);
        ATM withDrawLuis = new ATM(accountLuis);
        accountLuis.showData();
        System.out.println();
        withDrawLuis.withdrawMoney(25);
        System.out.println();
        accountLuis.showData();
        withDrawLuis.sendMoney(50, accountDaniel);
    }
}
