package ex_18072024;

import java.util.Scanner;

public class Mathequation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter value of X");
       double x= scan.nextDouble();
        System.out.println("Enter value of Y");
        double y= scan.nextDouble();
        System.out.println("Enter value of Z");
        double z= scan.nextDouble();
        double result;
        result= Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println(result);
    }
}
