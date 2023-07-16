/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hanoimain;


import java.util.Scanner;

/**
 *
 * @author nabeelnazeer
 */



public class HanoiMain {
    public static void towerOfHanoi(int n, char src, char aux, char des){
        if (n == 0){
        
            return;
            
        }
        towerOfHanoi(n-1, src, des, aux);
        System.out.println("Move disk "+n+" from rod " + src + " to " +des);
        towerOfHanoi(n-1, aux, src, des);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tower of Hanoi");
        System.out.println("Enter no. of disks: ");
        int n = sc.nextInt();
        towerOfHanoi(n, 'A', 'B', 'C');
        
    }
}
