package ex_17072024;

import java.util.Scanner;

public class VowelAndConsonant {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter alphabet");
       char c= scan.next().charAt(0);
       if(c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u' || c=='A'|| c=='E' ||  c=='I'|| c=='O' ||c=='U')
       {
           System.out.println("Vowel");
       }
       else {
           System.out.println("Consonant");
       }
    }
}
