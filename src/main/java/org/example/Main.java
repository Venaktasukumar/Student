package org.example;
import java.util.Scanner;
class Student {
    String Name;
    char Grade;
    float GPA;
    Student(String s, char G, float gpa){
        Name=s;
        Grade=G;
        GPA=gpa;
    }
    public void Update_GPA(float G_p_A){
        GPA=G_p_A;
        System.out.println("Your cgpa is updated");
    }
    public String Display_GPA(){
        return Name+" has a gpa is "+ GPA;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the student name:");
        String Student_Name=sc.nextLine();
        System.out.println("Enter your Grade:");
        char Grade_Level=sc.next().charAt(0);
        System.out.println("Enter your GPA:");
        float GPA=sc.nextFloat();
        Student S=new Student(Student_Name,Grade_Level,GPA);
        while(true){
            System.out.println("1.Upadte");
            System.out.println("2.Display");
            System.out.println("3.Exit");
            int A= sc.nextInt();
            if(A==1){
                System.out.println("Enter your GPA");
                float g_p_a=sc.nextFloat();
                S.Update_GPA(g_p_a);
            }
            else if(A==2){
                System.out.println(S.Display_GPA());
            }
            else{
                break;
            }
        }
        sc.close();
    }
}