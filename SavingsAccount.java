package labexer3;

public class SavingsAccount {
    private double balance;
    public static double InterestRate = 0;
    public SavingsAccount() {
    balance = 0;
    }
 public static void setInterestRate(double newRate) {  
     InterestRate = newRate;
 }
     public static double getInterestRate() {
         return InterestRate;
     } 
         public double getBalance() {
             return balance;
         }
         public void deposit(double amount) {
             balance += amount;
         }
         public double withdraw(double amount) {
             if ( balance >= amount)  { balance -= amount; 
             
             }else{
                
             } return 0;
         }
         public void addInterest(){
            double interest = balance * InterestRate;         
            balance += InterestRate;
         
}
         public static void showBalance(SavingsAccount account) {
             System.out.println("Your Balance is :" + account.getBalance());
}
}
