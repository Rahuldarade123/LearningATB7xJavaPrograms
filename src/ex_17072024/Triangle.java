package ex_17072024;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first side");
        int side1 =sc.nextInt();
        System.out.println("Enter second side");
        int side2 =sc.nextInt();
        System.out.println("Enter Third side");
        int side3 =sc.nextInt();
      /*  if (side1==side2 && side1==side3){
            System.out.println("Triangle is Equilateral");
        } else if (side1==side2 && side1!=side3){
            System.out.println("Triangle is Isosceles");

        }
        else if(side1==side3){
            System.out.println("Triangle is isoscales");

        }
        else if(side2==side3){
            System.out.println("Triangle is isoscales");
        }
        else{
            System.out.println("Trianle is scalene");
        }
       /*


       */
        if((side1==side2)&&(side2==side3)&&(side1==side3)){
            System.out.println("EQ");
        }
        else if((side1==side2)||(side2==side3)||(side1==side3)){
            System.out.println("ISO");
        }
        else{
            System.out.println("Scalene");
        }
    }
}

/*

 */