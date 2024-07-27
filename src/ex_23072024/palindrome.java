package ex_23072024;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Characters");
        String str=sc.next();
        StringBuilder SB= new StringBuilder(str);
        String reverse=SB.reverse().toString();
       if( reverse.equalsIgnoreCase(str)){
            System.out.println("Palindrome-> "+str);
        }else {
           System.out.println("Not a palindrome");
       }


    }
}
