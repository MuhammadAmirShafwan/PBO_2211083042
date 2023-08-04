/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Amir300323;

/**
 *
 * @author ASUS iD
 */
public class GetBilanganGanjil {
    public static void main(String[] args) {
        getGanjil();
    }
    
    public static void getGanjil() {
        int count = 0;
        
        for(int i = 1; count < 5; i++) {
            if (i % 2 !=0) {
                System.out.print("\t" + i);
                count++;
            }
        }
    }
}

