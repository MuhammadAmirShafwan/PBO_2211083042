/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AMIR_290323;

/**
 *
 * @author HP
 */
public class operasiaritmatika {
    public static void main(String[] args){
    // pastikan argumen diberikan sesuai 
    if (args.length != 2){
        System.out.println("Usage: java operasiaritmatika n1 n2");
        return;
    }
    //parsiang argumen ke dalam bilangan bilangan bulat
    int n1 = Integer.parseInt(args[0]);
    int n2 = Integer.parseInt(args[1]);
    
    //melakukan operasi aritmatika dan mencertak hasilnya ke layar
    System.out.println("Tambah = " + (n1 + n2));
    System.out.println("Kurang = " + (n1 - n2));
    System.out.println("Kali = " + (n1 * n2));
    System.out.println("Bagi = " + (n1 / n2));
    }
    
}
