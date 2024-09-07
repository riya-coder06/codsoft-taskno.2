// Task 2
// Student Grade Calculator

import java.util.Scanner;
public class StudentGradeCalculator {
      public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the student grade calculator");
        System.out.println("Enter no. of subjects you have:");
        int totalsubjects=sc.nextInt();
        int total=0;
        
        for(int i=1;i<=totalsubjects;i++){
           
            System.out.println("Enter marks obtained in Subject " +i+ ": ");
            int marks=sc.nextInt();
            total+=marks;
            
        }
             double AveragePercentage=(double)total/totalsubjects;
             System.out.println("Total Marks Scored is "+total);
             System.out.println("Average percentage obtained is  "+AveragePercentage+"%");
             char Grade;
             if(AveragePercentage>=95){
                System.out.println("Your Grade:A+");
             }
            else if(AveragePercentage>=90){
                System.out.println("Your Grade:A");
             }
             else if(AveragePercentage>=80){
                System.out.println("Your Grade:B+");
             }
             else if(AveragePercentage>=70){
                System.out.println("Your Grade:B");
             }
             else if(AveragePercentage>=60){
                System.out.println("Your Grade:C+");
             }
             else if(AveragePercentage>=50){
                System.out.println("Your Grade:C");
             }
             else if(AveragePercentage>=40){
                System.out.println("Your Grade:D");
             }
             else if(AveragePercentage>=33){
                System.out.println("Your Grade:E");
             }
             else{
                System.out.println("Sorry you are FAIL");
             }
      }







}
