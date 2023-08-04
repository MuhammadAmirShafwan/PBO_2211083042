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
public class BacaBilanganCase {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int angka=0;
        String kata = "";
        try{ 
            System.out.print("Angka : "); 
            angka = Integer.parseInt(dataIn.readLine());
        }   catch( IOException e ){ 
        System.out.println("Error!"); 
        }
            switch (angka){
            case 1:
                kata = "Satu";
                break;
            case 2:
                kata = "Dua";
                break;
            case 3:
                kata = "Tiga";
                break;
            case 4:
                kata = "Empat";
                break;
            case 5:
                kata = "Lima";
                break;
            case 6:
                kata = "Enam";
                break;
            case 7:
                kata = "Tujuh";
                break;
            case 8:
                kata = "Delapan";
                break;
            case 9:
                kata = "Sembilan";
                break;
            case 10:
                kata = "Sepuluh";
                break;
                default :
                
                kata = "Invalid Number";
        }
        System.out.println(kata);
    }
}
