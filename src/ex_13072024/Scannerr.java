package ex_13072024;

import java.util.Scanner;

public class Scannerr {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number");
     int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Number is odd");
        }
        else{
            System.out.println("Number is Even");
        }
        sc.close();

    }
}
