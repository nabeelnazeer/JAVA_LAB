/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.empolyeemain;

/**
 *
 * @author nabeelnazeer
 */
import java.util.Scanner;







public class EmpolyeeMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee Management System");
        System.out.println("Enter the no. of employees : ");
        int count = sc.nextInt();
        EmployeeList emplist = new EmployeeList(count);
        emplist.readList();
        emplist.Sort();
        emplist.display();
        sc.close();
        
    }
}
