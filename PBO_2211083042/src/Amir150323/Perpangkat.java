/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Amir150323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS iD
 */
public class Perpangkat {
    public static void main (String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int angka=0,pangkat=0;
        int hasil=1;
        try{ 
            System.out.print("Angka : "); 
            angka = Integer.parseInt(dataIn.readLine());
            System.out.print("Pangkat : "); 
            pangkat = Integer.parseInt(dataIn.readLine());
        }   catch( IOException e ){ 
        System.out.println("Error!"); 
        }
        
        System.out.println("Menggunakan Perulangan For : ");
        for(int i=0;i<pangkat;i++){
            hasil *= angka;
        }
        System.out.println(angka + " pangkat " + pangkat + " adalah " + hasil);
        
        System.out.println("Menggunakan Perulangan While : ");
        
        int a=1;
        int count=0;
        while(count<pangkat){
            a *=angka;
            count++;
        }     
        System.out.println(angka + " pangkat " + pangkat + " adalah " +a);

        System.out.println("Menggunakan Perulangan Do-While : ");
        int banyak = 0;
        int b=1;
         do {
            b *=angka;
            banyak++;
        
         } while(banyak<pangkat);
        System.out.println(angka + " pangkat " + pangkat + " adalah " +b);
    }
}
