package com.andrei.operators;

public class ReportGard {//табель по русски
    public char convertGrades(int testResult){
        char grade;
        if (testResult >= 90){
            grade = 'A';
        }else if (testResult >= 80 && testResult < 90){
            grade = 'B';
        }else if (testResult >= 70 && testResult < 80){
            grade = 'C';
        }else {
            grade = 'D';
        }
        return grade;
    }
    public static void main(String[] args){
        ReportGard rc = new ReportGard();
        char yourGrade = rc.convertGrades(88);
        System.out.println("Ваша первая оценка" + yourGrade);
        yourGrade = rc.convertGrades(79);
        System.out.println("Ваша вторая оценка" + yourGrade);
    }
}
