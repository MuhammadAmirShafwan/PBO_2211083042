/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Amir080323;
import java.io.*;
/**
 *
 * @author ASUS iD
 */

public class Latihan6 {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        int c = 0;
        int max ;
         try{ 
            System.out.print("Nilai 1 : "); 
            a = Integer.parseInt(dataIn.readLine());
            System.out.print("Nilai 2 : "); 
            b = Integer.parseInt(dataIn.readLine());
            System.out.print("Nilai 3 : "); 
            c = Integer.parseInt(dataIn.readLine());
        }   catch( IOException e ){ 
        System.out.println("Error!"); 
        } 
        max = (a>b) ?+a:+b;
        max =(c>max)?+c:+max;
        System.out.println("Nilai Tertinggi = "+max);
    }
}
