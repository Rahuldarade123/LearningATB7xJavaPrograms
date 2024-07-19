package ex_19072024;

import java.util.Scanner;

public class PositiveNegativenumber {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your choice number");
        float A =scan.nextFloat();
        if(A>0){
            System.out.println("Number is positive");
        } else if (A<0) {
            System.out.println("Number is Negative number");

        } else if (A==0) {
            System.out.println("Number is equal to zero");
     scan.close();
        }
    }
}
