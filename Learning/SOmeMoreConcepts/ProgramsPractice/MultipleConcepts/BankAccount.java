package Learning.SOmeMoreConcepts.ProgramsPractice.MultipleConcepts;

public class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private double balance;
    
    public long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean checkBalance(int amountToWithdraw){
        return (amountToWithdraw>getBalance()) ? false : true;
    }
    public void Withdraw(int amountToWithdraw){
        if (checkBalance(amountToWithdraw)){
            setBalance(getBalance()-amountToWithdraw);
            System.out.printf("Amount of %d is withdrawn\n New Balance = %f", amountToWithdraw, getBalance());
        }
        else{
            System.out.println("Balance in the account is LESS!");
        } 
    }

}
