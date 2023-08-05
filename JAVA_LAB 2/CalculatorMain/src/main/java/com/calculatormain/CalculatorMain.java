/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.calculatormain;

/**
 *
 * @author nabeelnazeer
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author nabeelnazeer
 */
public class CalculatorMain {
    
    public static void main(String[] args) {
        AddSub obj = new AddSub();
        obj.setVisible(true);
        obj.setTitle("Simple Calculator");
    }
    
}

class AddSub extends JFrame{
    JTextField t1;
    JTextField t2;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JTextArea l1;

    public AddSub() {
        t1 = new JTextField(15);
        t2 = new  JTextField(15);
        
        b1 = new JButton("Add");
        b2 = new JButton("Subtract");
        b3 = new JButton("Divide");
        b4 = new JButton("Multiply");
        l1 = new JTextArea("Result");
        l1.setEditable(false);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2,2));
        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);
        buttonPanel.add(b4);
        
        JPanel textFieldPanel =  new JPanel();
        textFieldPanel.setLayout(new GridLayout(2, 1));
        textFieldPanel.add(t1);
        textFieldPanel.add(t2);
        
        JPanel resultPanel = new JPanel();
        resultPanel.add(l1);
        
        b1.addActionListener((ActionEvent ae) -> {
            int num1  = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            
            int value =  num1 + num2;
            
            l1.setText(value + "");
        });
        
        b2.addActionListener((ActionEvent ae) -> {
            int num1  = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            
            int value =  num1 - num2;
            
            l1.setText(value + "");
        });
        
        b3.addActionListener((ActionEvent ae) -> {
            double num1  = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            
            double value =  num1 / num2;
            DecimalFormat format = new DecimalFormat("#.##");
            String formattedValue = format.format(value);
            
            l1.setText(formattedValue);
        });
        
        b4.addActionListener(((e) -> {
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            
            double value =  num1 * num2;
            DecimalFormat format = new DecimalFormat("#.##");
            String formattedValue = format.format(value);
            
            l1.setText(formattedValue);
        }));
        setLayout(new BorderLayout());
        add(textFieldPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);
        add(resultPanel, BorderLayout.CENTER);
        
        setSize(300,170);
        setDefaultCloseOperation(3);
    }
    
   
}
