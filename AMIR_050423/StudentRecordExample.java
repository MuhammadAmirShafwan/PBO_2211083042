/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AMIR_050423;

/**
 *
 * @author amir
 */
public class StudentRecordExample {
    public static void main(String[] args){
        StudentRecord alfaRecord = new StudentRecord();
         StudentRecord droprepalRecord = new StudentRecord();
         alfaRecord.setName("alfa petarung");
         alfaRecord.setAddress("di hati alfi");
         alfaRecord.setAge(20);
       
         
         System.out.println("nama   :"+alfaRecord.getName());
         System.out.println("Alamt   :"+alfaRecord.getAddress());
        System.out.println("umur   :"+alfaRecord.getAge());
         droprepalRecord.setName("drop reval");
         droprepalRecord.setAddress("padang panjang atau sampiang rumah firman");
        droprepalRecord.setAge(54);
         
         System.out.println("nama   :"+droprepalRecord.getName());
         System.out.println("Alamt   :"+droprepalRecord.getAddress());
         System.out.println("umur   :"+droprepalRecord.getAge());
    }
}
