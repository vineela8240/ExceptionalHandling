public class ThrowsException {
    public static void main(String[] args) {
        BankAccount account=new BankAccount(500.0);
        try{
            account.withdraw(600.0);
        }
        catch (InsufficentFundsException e){
            System.out.println("Caught an InsufficentFundsException" +e.getMessage());
        }
    }
}
class InsufficentFundsException extends Exception{
    public InsufficentFundsException(String message){
        super(message);
    }
}
class BankAccount{
    private double balance;
    public  BankAccount(double initialBalance){
        this.balance=initialBalance;
    }
    public void withdraw(double amount) throws InsufficentFundsException{
        if(amount>balance){
            throw new InsufficentFundsException("Insufficent funds for withdrawl.Available balance" +balance);
        }
        balance=balance-amount;
        System.out.println("withdrawl successful . Remaining Balance" +balance);

    }

    public double getBalance() {
        return balance;
    }
}