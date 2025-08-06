package labexer3;
import java.util.Scanner;
public class RunSavingsAccount {
    public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    SavingsAccount savings = new SavingsAccount();
    System.out.println("");
    double rate = x.nextDouble();
    
        SavingsAccount.setInterestRate(rate);
        System.out.println("Enter amount to deposit: ");
        double InitialDeposit = x.nextDouble();
        savings.deposit(InitialDeposit);
        System.out.println("Press D to deposit again or W to withdraw: ");
    
        char choice = x.next().toUpperCase().charAt(0);
            if (choice == 'D') {
            System.out.println("Enter amount to deposit: ");
            double amount = x.nextDouble();
            double withdrawn = savings.withdraw(amount);
            
             if (withdrawn == 0) {
                System.out.println("Insufficient Balance");
            }else{
                System.out.println("You withdraw" + withdrawn);
             }
            }else{
                    System.out.println("Invalid");
            }
            SavingsAccount.showBalance(savings);
            if (savings.getBalance() > 1000) {
                savings.addInterest();
                System.out.println("Interest applied.");
                        SavingsAccount.showBalance(savings);
            }
            x.close();
        }
}
