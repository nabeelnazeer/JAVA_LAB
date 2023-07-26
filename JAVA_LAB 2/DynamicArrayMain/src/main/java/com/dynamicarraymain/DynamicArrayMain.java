/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.dynamicarraymain;

/**
 *
 * @author nabeelnazeer
 */

import java.util.Scanner;


class DynamicArray{
    private int[] dynamicArray;
    private int len;
    protected int capacity;
    
    public DynamicArray(){
        Scanner sc = new Scanner(System.in);
        this.len = 0;
        System.out.println("Enter the capacity : ");
        this.capacity  = sc.nextInt();
        this.dynamicArray = new int[capacity];
        
           
    }

    public void printArray(){
        for (int i = 0; i < len; i++) {
            System.out.print(dynamicArray[i] + " ");
        }
        System.out.println();
        
    }
    public  void addElement( int element){
        if (len == capacity){
            int[] newDynamicArray = new int[capacity * 2];
            for(int i = 0;i<len; i++){
             newDynamicArray[i] = dynamicArray[i];
            }
            dynamicArray = newDynamicArray;
            capacity *= 2;
            
        }
        dynamicArray[len] = element; 
        len++;
    }
    public void remove(int index){
        if(index < 0 || index>=len ){
            throw new IndexOutOfBoundsException("Index out of rannge");
        }
        for(int i = index; i< len -1 ;i++){
            dynamicArray[i] = dynamicArray[i+1];
        }
        len--;
        
    }

    
    
}


public class DynamicArrayMain {

    public static void main(String[] args) {
        
        
        Scanner sc =  new Scanner(System.in);
        
        
        DynamicArray dynamicArray = new DynamicArray();
        
        int choice;
        
        do{
            System.out.println("/nmenu");
            System.out.println("1. print Array");
            System.out.println("2. Add element");
            System.out.println("3. Remove element");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("Current Array:");
                    dynamicArray.printArray();
                    break;
                case 2:
                    System.out.print("Enter the element to add: ");
                    int element = sc.nextInt();
                    dynamicArray.addElement(element);
                    System.out.println("Element added successfully.");
                    break;
                case 3:
                    System.out.print("Enter the index of the element to remove: ");
                    int indexToRemove = sc.nextInt();
                    try {
                        dynamicArray.remove(indexToRemove);
                        System.out.println("Element removed successfully.");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
                    
                    
                    
                
            }
            
            
        }while(choice!=4);
        
        
    }
}
