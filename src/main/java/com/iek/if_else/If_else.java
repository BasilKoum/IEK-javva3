/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.iek.if_else;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class If_else {
     static  public String name;
     static  public int age;
      static public char gender;
     static  public double salary;
     static public boolean adult;
     static public boolean female;
    public static void main(String[] args) {
       Employee emp1=new Employee(x:"Costas", y:"M");
       Employee emp2=new Employee(x:"Maria",y:"F");
       emp1.employeeInfo(emp1);
       
       
       
       printStat();
       

    }
   static void printStat() {
   
        Scanner console=new Scanner(System.in);
        System.out.println("Enter name:");
        name=console.nextLine();
        System.out.println("Enter age:");
        age=console.nextInt();
        System.out.println("Enter gender:(F/M)");
        gender=console.next().charAt(0);
        System.out.println("Enter salary:");
        salary=console.nextDouble();
        System.out.println("Name:"+name+"Age:"+getAge()+"Gender:"+getGender()+"Salary:"+getSalary());
    }
 static public int getAge(){
       return age;
   }
 static public  double getSalary(){
       return salary;
   }
 static char getGender(){
     return gender;
 }
 static boolean isFemale(){
     if(getGender()=="F"){
         female=true;
     }else{
         female=false;
     }
     return female;
 }
 static boolean isAdult(){
     if(age>18){
         adult=true;
     }else{
         adult=false;
     }
     return adult;
 }
static void setSalary(double x){
    salary=x;
 }
}
