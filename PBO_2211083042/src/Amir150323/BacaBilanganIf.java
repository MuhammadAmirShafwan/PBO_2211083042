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
public class BacaBilanganIf {
    public static void main (String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int angka=0;
        String kata = "";
        try{ 
            System.out.print("Angka : "); 
            angka = Integer.parseInt(dataIn.readLine());
        }   catch( IOException e ){ 
        System.out.println("Error!"); 
        }
        if(angka==1){
            kata = "Satu";
        }
        else if(angka==2){
            kata = "Dua";
        }
        else if(angka==3){
            kata = "Tiga";
        }
        else if(angka==4){
            kata = "Empat";
        }
        else if(angka==5){
            kata = "Lima";
        }
        else if(angka==6){
            kata = "Enam";
        }
        else if(angka==7){
            kata = "Tujuh";
        }
        else if(angka==8){
            kata = "Delapan";
        }
        else if(angka==9){
            kata = "Sembilan";
        }
        else if(angka==10){
            kata = "Sepuluh";
        }
        else{
            kata = "Invalid Number";
        }
        System.out.println(kata);
    }
}
