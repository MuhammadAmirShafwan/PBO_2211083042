/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AMIR_160323;

/**
 *
 * @author LABP1KOMP
 */
import java.io.BufferedReader;
import javax.swing.JOptionPane;

public class NomorTerbesar_BufferedReader {
    public static int parseInt(String name){
        return x;
    }
    public static void main( String[] args ){ 
        String name = ""; 
        int []x = new int[100];
        // a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j =0;
        name = JOptionPane.showInputDialog("number 1");
        name = JOptionPane.showInputDialog("number 2");
        name = JOptionPane.showInputDialog("number 3");
        name = JOptionPane.showInputDialog("number 4");
        name = JOptionPane.showInputDialog("number 5");
        name = JOptionPane.showInputDialog("number 6");
        name = JOptionPane.showInputDialog("number 7");
        name = JOptionPane.showInputDialog("number 8");
        name = JOptionPane.showInputDialog("number 9");
        name = JOptionPane.showInputDialog("number 10");
        
        int i=Integer.parseInt(name);  
        System.out.println(i);  
        }
        String msg = "Hello " + name + "!"; 
        JOptionPane.showMessageDialog(null, msg); 

    } 
} 