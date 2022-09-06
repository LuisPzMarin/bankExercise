package src;

public class ATM {
    private BankAccount session;

    public ATM(BankAccount session){
        this.session = session;
    }

    public void withdrawMoney(double moneyToWithdraw){
        double actualBalance = session.getBalance();
        if(actualBalance < moneyToWithdraw){
            System.out.println("No tiene dinero suficiente");
            return;
        }
        session.setBalance(actualBalance - moneyToWithdraw);
        System.out.println("Usted ha retirado " + moneyToWithdraw + " euros");

    }

}
