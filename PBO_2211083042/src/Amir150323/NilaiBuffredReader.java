/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Amir150323;
import java.io.*;
/**
 *
 * @author ASUS iD
 */
public class NilaiBuffredReader {
    public static void main (String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int a=0,b=0,c=0;
        int avg;
        
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
       avg=(a+b+c)/3;
       System.out.println("Rata - Rata : "+avg);
       System.out.println();
       System.out.println("Ketreangan : ");
       if (avg >= 60){
           System.out.println(" :)");
       }
       else {
           System.out.println(":(");
       }
    }
}
