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
    
    public void deposit(double amount) {
         accountBalance += amount;
         System.out.println("Amount successfully deposited.");
         System.out.println("New balance : " + accountBalance);
    }

    public abstract void withdrawal(double amount);

    public void displayAccount() {
        System.out.println("Acoount holder name: " + holderName);
        System.out.println("Account no. : " + accountNo);
        System.out.println("Balance: " + accountBalance);
    }
    
}

class SavingsAccount extends Account{
    private static final double MIN_BALANCE = 1000;

    public SavingsAccount(String holderName, int accNo, double balance) {
        super(holderName,accNo,balance);
    }

    

    public void withdrawal(double amount) {
        
        if (accountBalance - amount >= MIN_BALANCE){
            accountBalance -= amount;
            System.out.println("Amount withdrawn successfully");
            System.out.println("New balance: " + accountBalance);
        }else{
            System.out.println("Insufficient balance");
        }
    }
}

class CurrentAccount extends Account{
    private static final double OVERDRAFT = 0.05;

    public CurrentAccount(String holderName, int accNo,double balance ){
        super(holderName, accNo, balance);
    }


    
    public void withdrawal(double amount) {
        double overdraftAmount = accountBalance * OVERDRAFT;
        if (accountBalance - amount >= -overdraftAmount) {
            accountBalance -= amount;
            System.out.println("Amount withdrawn successfull");
            System.out.println("New balance: " + accountBalance );
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

            scanner.nextLine();

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
                    break;
                case 0:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;                        
            } 


        } while (!(choice == 0));
    }
    private static void createSavingAccount(Scanner scanner){
        System.out.println("Enter account holder name : ");
        String holderName = scanner.nextLine();

        System.out.println("Enter Account number : ");
        int accNo = scanner.nextInt();
        scanner.nextLine();

        if (checkAccountNumber(accNo)){
            System.out.println("The Account number already exists");
            return;
        }

        System.out.println("Enter the initial balnace : ");
        double balance = scanner.nextDouble();
        scanner.nextLine();

        Account account = new SavingsAccount(holderName,accNo,balance);
        accounts.add(account);
        System.out.println("Account created successfully!");

    }
    private static void createCurrentAccount(Scanner scanner){
        System.out.println("Enter account holder name : ");
        String holderName = scanner.nextLine();

        System.out.println("Enter Account number : ");
        int accNo = scanner.nextInt();
        scanner.nextLine();

        if (checkAccountNumber(accNo)){
            System.out.println("The Account number already exists");
            return;
        }

        System.out.println("Enter the initial balnace : ");
        double balance = scanner.nextDouble();
        scanner.nextLine();

        Account account = new SavingsAccount(holderName,accNo,balance);
        accounts.add(account);
        System.out.println("Account created successfully!");

    }
    private static void depositAmount(Scanner scanner){
        System.out.println("Enter the account number: ");
        int accNo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Deposit Amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        

        Account account = getAccountNumber(accNo);
        if (account != null){
            account.deposit(amount);
        }
        else{
            System.out.println("Account Does not exist");
        }
    }

    private static void withdrawAmount(Scanner scanner){
        System.out.println("Enter the account number: ");
        int accNo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the amount to withdraw");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        Account account = getAccountNumber(accNo);
        if (account != null){
            account.withdrawal(amount);
        }
        else{
            System.out.println("Account does not exist");
        }
    }

    private static void displayAccountDetails(Scanner scanner){
        System.out.print("Enter Account Number: ");
        int accNo = scanner.nextInt();
        scanner.nextLine();

        Account account = getAccountNumber(accNo);

        if (account != null) {
            account.displayAccount();
        }
        else{
            System.out.println("Account does not exist");
        }


    }
    private static Account getAccountNumber(int accountNumber){
        for (Account account : accounts){
            if (account.accountNo == accountNumber){
                return account;
            }
        }
        return null;
    }
    private static boolean checkAccountNumber(int accountNumber){
        for (Account account : accounts){
            if (account.accountNo == accountNumber) {
                return true;
            }
        }
        return false;
    }

}
/*----ACCOUNT MANAGEMENT SYSTEM----
1. Create savings account
2. create current account
3. Deposit amount
4. Withdraw amount
5. Display account details
0. Exit
Enter your choice1
Enter account holder name : 
nabeel
Enter Account number : 
1
Enter the initial balnace : 
2000
Account created successfully!
1. Create savings account
2. create current account
3. Deposit amount
4. Withdraw amount
5. Display account details
0. Exit
Enter your choice3
Enter the account number: 
200
Enter Deposit Amount: 2
Account Does not exist
1. Create savings account
2. create current account
3. Deposit amount
4. Withdraw amount
5. Display account details
0. Exit
Enter your choice4
Enter the account number: 
1
Enter the amount to withdraw
1000
Amount withdrawn successfully
New balance: 1000.0
1. Create savings account
2. create current account
3. Deposit amount
4. Withdraw amount
5. Display account details
0. Exit
Enter your choice2
Enter account holder name : 
nazeer
Enter Account number : 
2
Enter the initial balnace : 
2000
Account created successfully!
1. Create savings account
2. create current account
3. Deposit amount
4. Withdraw amount
5. Display account details
0. Exit
Enter your choice4
Enter the account number: 
2150 
Enter the amount to withdraw
1
Account does not exist
1. Create savings account
2. create current account
3. Deposit amount
4. Withdraw amount
5. Display account details
0. Exit
Enter your choice4
Enter the account number: 
2
Enter the amount to withdraw
2150
Insufficient balance
1. Create savings account
2. create current account
3. Deposit amount
4. Withdraw amount
5. Display account details
0. Exit
Enter your choice0
Thank you*/