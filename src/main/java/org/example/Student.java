package org.example;
import java.util.*;
import java.util.logging.*;
class Student {
    Logger l = Logger.getLogger("com.api.jar");
    String name;
    char grade;
    float gPA;
    Student(String s, char g, float gpa){
        name=s;
        grade=g;
        gPA=gpa;
    }
    public void updateGPA(float gPa){
        gPA=gPa;
        l.info("Your cgpa is updated");
    }
    public String displayGPa(){
        return name+" has a gpa is "+ gPA;
    }
    public static void main(String[] args){
        Logger l = Logger.getLogger("com.api.jar");
        Scanner sc=new Scanner(System.in);
        l.info("Enter the student name:");
        String studentname=sc.nextLine();
        l.info("Enter your Grade:");
        char gradelevel=sc.next().charAt(0);
        l.info("Enter your GPA:");
        float gpa=sc.nextFloat();
        Student s=new Student(studentname,gradelevel,gpa);
        while(true){
                l.info("1.Upadte");
                l.info("2.Display");
                l.info("3.Exit");
                int a= sc.nextInt();
                if(a==1){
                    l.info("Enter your GPA");
                    float gPA=sc.nextFloat();
                    s.updateGPA(gPA);
                }
                else if(a==2){
                    String z=s.displayGPa();
                    l.info(z);
                }
                else if(a==3){
                    l.info("Exit");
                    break;
                }
                else{
                    l.info("invalid choice");
                }
            }
        sc.close();
    }
}