/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Amir120423;

/**
 *
 * @author ASUS iD
 */
public class Student extends Person  {
    public Student(){ 
        super("Budi","Padang");
        System.out.println("Inside Student:Constructor");
        
    }
    public static void main(String[] args){
        Student student = new Student();
        student.name = "Ali";
        student.address = "Padang";
    }
    @Override
    public String getName(){
        System.out.println("getName Student ");
        return name; 
    } 
}

