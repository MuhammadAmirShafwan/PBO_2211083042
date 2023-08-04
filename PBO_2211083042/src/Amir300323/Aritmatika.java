/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Amir300323;

/**
 *
 * @author ASUS iD
 */
public class Aritmatika {
    public static int tambah(int a, int b) {
        return a + b;
    }
    
    public static boolean cekGanjil(int n) {
        return n % 2 != 0;
    }
    
    public static void main(String[] args) {
        int a=15;
        int b=10;
        int hasil = tambah(a,b);
        System.out.println("Hasil penjumlahan: " + hasil);
        
        if (cekGanjil(hasil)) {
            System.out.println("Hasil ganjil");
        } else {
            System.out.println("Hasil genap");
        }
    }
}
