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
    public static void main(String[] args) {
        int x=20;
        int y=18;
        
        if (x>y);
        
        System.out.println("x is greater than y");
        
        if (y>x);
        
        System.out.println("y is greater than x");
       printStat();
       
       System.out.println(getAge());
       System.out.println(getSalary());
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
        System.out.println("Name:"+name+"Age"+age+"Gender"+gender+"Salary:"+salary);
    }
 static public int getAge(){
       return age;
   }
 static public  double getSalary(){
       return salary;
   }
}
