package Learning.SOmeMoreConcepts.ProgramsPractice;

public class Customer {
    public static void main(String[] args) {
        BankAccount cusAccount = new BankAccount();
        cusAccount.setAccountHolderName("Krina Patel");
        cusAccount.setAccountNumber(98127398);
        cusAccount.setBalance(1000);

        cusAccount.Withdraw(200);
        System.out.println();
        System.out.println(cusAccount.getClass());
        System.out.println(cusAccount.toString());
        System.out.println(cusAccount.hashCode());
    }
}
