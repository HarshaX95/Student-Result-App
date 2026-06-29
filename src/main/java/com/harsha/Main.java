package com.harsha;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String studentName = "Harsha";
        String usn = "2XX22MCA001";
        int marks = 92;
        String result = (marks >= 40) ? "PASS" : "FAIL";

        System.out.println("=================================");
        System.out.println("      STUDENT RESULT SYSTEM");
        System.out.println("=================================");
        System.out.println("Student Name : " + studentName);
        System.out.println("USN          : " + usn);
        System.out.println("Marks        : " + marks);
        System.out.println("Result       : " + result);
        System.out.println("=================================");
    }
}