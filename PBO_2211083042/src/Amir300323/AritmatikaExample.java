/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Amir300323;

/**
 *
 * @author ASUS iD
 */

class Aritmatika2 {
    public static int tambah(int a, int b) {
        return a + b;
    }

    public static boolean cekGanjil(int n) {
        return n % 2 != 0;
    }
    
    public static int[] getGanjil() {
        int[] ganjil = new int[5];
        int n = 0;
        
        for(int i = 1; n < 5; i++) {
            if (i % 2 == 1) {
                ganjil[n] = i;
                n++;
            }
        }
        return ganjil;
    }
    public static int[] getPrima(int n) {
        int[] prima = new int[n];
        int count = 0;
        
        for(int i = 2; count < n; i++) {
            boolean isPrima = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrima = false;
                    break;
                }
            }
            if (isPrima) {
                prima[count] = i;
                count++;
            }
        }
        return prima;
    }
}


public class AritmatikaExample {
    public static void main(String[] args){
        Aritmatika2 aritmatika = new Aritmatika2();
        int c = aritmatika.tambah(10, 5);
        System.out.println("C : "+c);
        System.out.println("Ganjil? "+aritmatika.cekGanjil(c));
        System.out.println();
        
        int[] ganjil = aritmatika.getGanjil();
        for (int i = 0; i < ganjil.length; i++) {
            System.out.print("\t" + ganjil[i]);
        }
        System.out.println();
        System.out.println();
        System.out.println("\t\t\tPRIMA");
        System.out.println();
        int[] prima = aritmatika.getPrima(5);
        for (int i = 0; i < prima.length; i++) {
            System.out.print("\t" + prima[i]);
        }
    }
}