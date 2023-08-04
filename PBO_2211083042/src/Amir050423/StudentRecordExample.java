/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Amir050423;

/**
 *
 * @author ASUS iD
 */
public class StudentRecordExample{
    public static void main(String[] args){
        StudentRecord annaRecord = new StudentRecord();
        StudentRecord crisRecord = new StudentRecord(); 
        
        //Memberi 
        annaRecord.setName("Anna");  
        annaRecord.setAddress("Padang");
        annaRecord.setAge(20);
        annaRecord.setMathGrade(85);
        annaRecord.setEnglishGrade(90);
        annaRecord.setScienceGrade(80);
        
        crisRecord.setName("Cris");  
        crisRecord.setAddress("Padang Panjang");
        crisRecord.setAge(21); 
        
        //Menampilkan nama siswa “Anna” 
        System.out.println("Nama    :   "+annaRecord.getName());
        System.out.println("Asal    :   "+annaRecord.getAddress());
        System.out.println("Umur    :   "+annaRecord.getAge());
//        System.out.println("Nilai Matematika    :   "+annaRecord.getMathGrade());
//        System.out.println("Nilai English       :   "+annaRecord.getEnglishGrade());
//        System.out.println("Nilai Science       :   "+annaRecord.getScienceGrade());
//        System.out.println("\nRata - Rata       :   "+annaRecord.getAverage());

        System.out.println("\nNama    :   "+crisRecord.getName());
        System.out.println("Asal    :   "+crisRecord.getAddress());
        System.out.println("Umur    :   "+crisRecord.getAge());
        
        StudentRecord aliRecord = new StudentRecord();
        aliRecord.setName("Ali");
        aliRecord.setAddress("Bukittinggi");
        aliRecord.setAge(23);
        
        System.out.println();
        aliRecord.print("");
        aliRecord.print(70, 80, 90);
        
        //Menampilkan jumlah siswa 
        System.out.println("Count : "+StudentRecord.getStudentCount());
    }
}
