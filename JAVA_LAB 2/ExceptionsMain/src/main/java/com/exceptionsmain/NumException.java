/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exceptionsmain;

/**
 *
 * @author nabeelnazeer
 */
public class NumException {
    private String  number = "123";
    private String  alphabet = "abc";
    private int numberOnly;
    private int exception;
    
    public NumException(){
        
        this.numberOnly = Integer.parseInt(number);
        try{
            this.exception = Integer.parseInt(alphabet);
        }catch(NumberFormatException e){
            System.out.println("Number format exception ocurred");
        }
    }
}
