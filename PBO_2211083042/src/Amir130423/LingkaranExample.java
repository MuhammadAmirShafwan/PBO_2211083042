/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Amir130423;

/**
 *
 * @author ASUS iD
 */
public class LingkaranExample {
    public static void main(String [] args){
    Relation myInteger = new MyInteger();
        Relation myDouble = new MyDouble();
        boolean hasilInt = myInteger.isGreater(5, 6);
        boolean hasilDbl = myDouble.isGreater(6.4, 2.2);
        System.err.println("Hasil Integer "+hasilInt);
        System.err.println("Hasil Double "+hasilDbl);
        
        Relation myling = new Lingkaran();
        Lingkaran ling1 = new Lingkaran(7);
        Lingkaran ling2 = new Lingkaran(3);
        boolean lingA_lingB = myling.isGreater(ling1, ling2);
        System.out.println("Lingkaran A > Lingkaran B : "+lingA_lingB);
       
        System.out.println("Luas Lingkaran 1 : "+Math.round(ling1.getLength()));
        System.out.println("Luas Lingkaran 2 : "+Math.round(ling2.getLength()));
    }
}
