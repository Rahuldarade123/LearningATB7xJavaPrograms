package ex_13072024;

import java.util.Scanner;

public class Elseiftest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        double result = sc.nextDouble();
        
        if(result>90 && result<=100){
            System.out.println("A grade");
        } else if (result>80 && result<=89) {
            System.out.println("B grade");
        } else if (result>69 && result<=79) {
            System.out.println("C grade");
        }
        else if (result>59 && result<=69){
            System.out.println("D grade");
        }
else if (result>=0 && result<=59){
            System.out.println("Failed");
        }
else if (result>100){
            System.out.println("Go to USA");
        }
    }
}
