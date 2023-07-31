/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empolyeemain;

import java.util.Scanner;

/**
 *
 * @author nabeelnazeer
 */
public class Employee{
    
    private String employeeName;
    private int employeeId;
    private int salary;
    private DateOfBirth dob = new DateOfBirth();
    private DateOfJoin doj = new DateOfJoin();
    
    public Employee(){
        this.employeeName = "";
        this.employeeId = 0;
        this.salary = 0;
    }
    
    public int getSalary(){
        return salary;
    }
    public int getID(){
        return employeeId;
    }
    
    public void setDetails(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the name of employee");
        employeeName = sc.nextLine();
        System.out.println("Enter the Employee ID");
        employeeId = sc.nextInt();
        System.out.println("Enter the salary :");
        salary = sc.nextInt();
        System.out.println("Enter Date of birth details : ");
        dob.setDOB();
        System.out.println("enter Date of Joinig Detatils : ");
        doj.setDOJ();
    }
    
    static class DateOfBirth{
        private int day, month, year;
        
        public DateOfBirth(){
        
        this.day = 0;
        this.month = 0;
        this.year = 0;
        
        }
        
        public DateOfBirth(int d,int m,int y){
            this.day = d;
            this.month = m;
            this.year = y;
        }
        public void setDOB(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the day : ");
        day = sc.nextInt();
        System.out.println("Enter the month : ");
        month = sc.nextInt();
        System.out.println("Emter the year : ");
        year = sc.nextInt();
        }
        
        public void printDOB(){
            System.out.println("Date of Birth : "+ day + "-" + month + "-" +year);
        }

    }
    static class DateOfJoin{
        private int day, month, year;
        
        public DateOfJoin(){
            this.day = 0;
            this.month = 0;
            this.year = 0;
        }
        public DateOfJoin(int d, int m, int y){
            this.day = d;
            this.month = m;
            this.year = y;
        }
        public void setDOJ(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the day : ");
            day = sc.nextInt();
            System.out.println("Enter the month : ");
            month = sc.nextInt();
            System.out.println("Enter the year : ");
            year = sc.nextInt();
        }
        public void printDOJ(){
            System.out.println("Date of joining : "+ day + "-" + month +"-"+year);
        }
    }
    
    public void displayData(){
        System.out.println("Employee name : " + employeeName);
        System.out.println("Employee ID : "+ employeeId);
        System.out.println("Employee salary : " + salary);
        dob.printDOB();
        doj.printDOJ();
    }
   
    
    
}