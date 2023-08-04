/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Amir150323;
import javax.swing.*;
/**
 *
 * @author ASUS iD
 */
public class NilaiJoptionPane {
    public static void main (String[] args){
        int a=0,b=0,c=0;
        int avg;
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Nilai 1 : "));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Nilai 2 : "));
        c = Integer.parseInt(JOptionPane.showInputDialog(null, "Nilai 3 : "));
        avg = (a+b+c)/3;
        
        JOptionPane.showMessageDialog(null, "Rata-rata nilai ujian: " +avg);
        if (avg >=60){
            JOptionPane.showMessageDialog(null,":)");
        }
        else {
            JOptionPane.showMessageDialog(null,":(");
        }
    }
}
