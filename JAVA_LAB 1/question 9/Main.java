import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Employee{
    protected String employeeName;
    protected int employeeCode;
    protected double basicPay;

    public Employee(String employeeName, int employeeCode, double basicPay) {
        this.employeeName = employeeName;
        this.employeeCode = employeeCode;
        this.basicPay = basicPay;
    }

    public void printInfo(){
        System.out.println("Employee name: " + employeeName);
        System.out.println("Employee code: " + employeeCode);
        System.out.println("Employee Basic Pay: " + basicPay);
        System.out.println("Total allowance: 20%");
        System.out.println("Deductions : 15%");
    }
}

interface Salary{
    public double calculateSalary();
}

class salarySlip extends Employee implements Salary{
    private netSalry;

    public void salarySlip(String employeeName, int employeeCode, double basicPay){
        super(employeeName, employeeCode, basicPay);
    }

    public double calculateSalary(){
        double ALLOWANCE = 0.02;
        double MIN_DEDUCTION = 0.15;
        netSalary = basicPay * ALLOWANCE * MIN_DEDUCTION;
        return basicPay;
    }
} 
public class Main{
    private static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("----EMPLOYEE MANAGEMENT SYSTEM----");

        do{
            System.out.println("1. Add an employee");
            System.out.println("2. Print salary slip");
            System.out.println("3. Quit");
            System.out.print("4. Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    createEmployee(scanner);
                case 2:
                    printSlip(scanner);    
            }
        }
    }

}