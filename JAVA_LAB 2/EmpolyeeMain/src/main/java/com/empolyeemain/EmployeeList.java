/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empolyeemain;

/**
 *
 * @author nabeelnazeer
 */
public class EmployeeList {
    
    private Employee emp[];
    private int count;
    
    public EmployeeList(){
        this.count = 0;
    }
    
    public EmployeeList(int n){
        this.count = n;
        emp = new Employee[count];
    }
    
    public void readList(){
        for(int i =0; i<count; i++){
            emp[i] = new Employee();
            System.out.println("Enter details of " + i+1 + " employee : ");
            emp[i].setDetails();
        }
    }
    public void Sort(){
        for(int i = 0;i<count;i++){
            Employee current = emp[i];
            int j = i-1;
            while(j>=0 && current.getSalary()>emp[j].getSalary()){
                emp[j+1] = emp[j];
                j--;
            }
            emp[j+1] = current;
        }
    }
    
    public void display(){
        for(int i = 0;i<count;i++){
            emp[i].displayData();
        }
    }
    
}
