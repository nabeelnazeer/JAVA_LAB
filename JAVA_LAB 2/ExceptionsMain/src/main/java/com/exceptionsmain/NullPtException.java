/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exceptionsmain;

/**
 *
 * @author nabeelnazeer
 */
public class NullPtException {
    private String str = null;
    
    public NullPtException(){
        try{
            int length = str.length();
        }catch(NullPointerException ex){
            System.out.println("Null pointer exception detected");
        }
    }
    
}
