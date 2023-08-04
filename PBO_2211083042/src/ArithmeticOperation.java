

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS iD
 */
public class ArithmeticOperation {
    public static void main(String[] args){
        if (args.length != 2) {
            System.out.println("Masukkan 2 bilangan pada command line!");
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        
        int tambah = a+b;
        int kurang = a-b;
        int kali = a*b;
        int bagi = a/b;
        
        System.out.println("Hasil Tambah : "+tambah);
        System.out.println("Hasil Kurang : "+kurang);
        System.out.println("Hasil Kali : "+kali);
        System.out.println("Hasil Bagi : "+bagi);
    }
}