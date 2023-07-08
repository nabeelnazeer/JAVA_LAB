import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

abstract class Account{
    protected String holderName;
    protected int accountNo;
    protected double accountBalance;

    public Account(String name, int accNo, double balance) {
        this.holderName = name;
        this.accountNo = accNo;
        this.accountBalance = balance;
    }
    
    public void depositAmount(double amount) {
         accountBalance += amount;
         System.out.println("Amount successfully deposited.");
         System.out.println("New balance : " + accountBalance);
    }

    public abstract void withdrawAmount(double amount);

    public void displayAccount() {
        Systme.out.println("Acoount holder name: " + holderName);
        Systme.out.println("Account no. : " + accNo);
        Systme.out.println("Balance: " + accountBalance);
    }
    
}

class SavingsAccount extends Account{
    private static final double MIN_BALANCE = 1000;

    public SavingsAccount(String holderName, int accNo, double balance) {
        super(holderName,accNo,balance);
    }

    @override

    public void withdrawAmount(double amount) {
        
        if (balance - amount <= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully");
            System.out.println("New balance: " + balance);
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
}

class CurrentAccount extends Account{
    private static final double OVERDRAFT = 0.05;

    public CurrentAccount(String holderName, int accNo,double balance ){
        super(holderName, accNo, balance);
    }


    @override
    public void withdrawAmount(double amount) {
        double overdraftAmount = balance * OVERDRAFT;
        if (balance - amount >= -overdraftAmount) {
            balance -= amount;
            System.out.println("Amount withdrawn successfull");
            System.out.println("New balance: " + balance );
        }
        else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}
public class Main{
    private static List<Account> accounts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("----ACCOUNT MANAGEMENT SYSTEM----");

        do {
            System.out.println("1. Create savings account");
            System.out.println("2. create current account");
            System.out.println("3. Deposit amount");
            System.out.println("4. Withdraw amount");
            System.out.println("5. Display account details");
            System.out.println("0. Exit");
            System.out.print("Enter your choice");
            choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    createSavingAccount(scanner);
                    break;
                case 2:
                    createCurrentAccount(scanner);
                    break;
                case 3:
                    depositAmount(scanner);
                    break;
                case 4:
                    withdrawAmount(scanner);
                    break;
                case 5:
                    displayAccountDetails(scanner);
                    break
                case 0:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;                        
            } 


        } while (!choice == 0);
    }
    private static void createSavingAccount(Scanner scanner){
        
    }

}