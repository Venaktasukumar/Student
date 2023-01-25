package org.example;
import java.util.Scanner;
class Student {
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
        System.out.println("Your cgpa is updated");
    }
    public String displayGPA(){
        return name+" has a gpa is "+ gPA;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the student name:");
        String studentname=sc.nextLine();
        System.out.println("Enter your Grade:");
        char gradelevel=sc.next().charAt(0);
        System.out.println("Enter your GPA:");
        float gpa=sc.nextFloat();
        Student s=new Student(studentname,gradelevel,gpa);
        while(true){
            System.out.println("1.Upadte");
            System.out.println("2.Display");
            System.out.println("3.Exit");
            int a= sc.nextInt();
            if(a==1){
                System.out.println("Enter your GPA");
                float gPA=sc.nextFloat();
                s.updateGPA(gPA);
            }
            else if(a==2){
                System.out.println(s.displayGPA());
            }
            else{
                break;
            }
        }
        sc.close();
    }
}