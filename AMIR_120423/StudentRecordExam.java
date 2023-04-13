/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AMIR_120423;

import AMIR_120423.StudentRecord;

/**
 *
 * @author AMIR
 */
public class StudentRecordExam extends StudentRecord {
    public StudentRecordExam(){
    super.name = "akmal";
    super.address = "andaleh";
    super.age = 19;
    
    super.mathGrade = 89;
    super.englishGrade = 90;
    super.scienceGrade = 78;
    super.average = (mathGrade+scienceGrade)/2;
}
}