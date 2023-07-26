/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mavenproject1;

/**
 *
 * @author nabeelnazeer
 */
import java.util.Scanner;

public class PascalsMain {
    
    
    public static void pascalsLoop(int rowNum){
        for(int i = 0;i<rowNum;i++){
            for(int k=rowNum;k>0;k--){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
               System.out.print(pascalsTriangle(i,j) + " ");
            }
            System.out.println();
        } 
    }
    
    public static int pascalsTriangle(int n, int k){
        if (k == 0 || k == n){
            return 1;
        }
        else{
            
            return pascalsTriangle( n-1 , k-1) + pascalsTriangle(n-1, k);
            
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows : ");
        int numRows = sc.nextInt();
        
        pascalsLoop(numRows);
        
        
    }
    
    
}
