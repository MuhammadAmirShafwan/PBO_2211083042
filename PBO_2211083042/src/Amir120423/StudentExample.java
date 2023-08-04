/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Amir120423;

/**
 *
 * @author ASUS iD
 */
public class StudentExample {
    public static void main (String[] args){
    Student student = new Student();
    System.out.println("Nama   : "+student.getName());
    System.out.println("Alamat : "+student.getAddress());
    
    StudentRecord student2 = new StudentRecord();
    //StudentRecord student2 = new StudentRecord(20);
    //System.out.println("Nilai Matematika : "+student2.getMathGrade());
    student2.print(20,80, 85, 90);
    }
}
