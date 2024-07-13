package ex_13072024;

import java.util.Locale;

public class learnstring {
    public static void main(String[] args) {
        String s3="The Testing Academy";
        String s4="The Testing Academy ";
       s3.toLowerCase();
        System.out.println(s3==s4);
        // it will check whether references are same??
        System.out.println(s3.equals(s4));
        // it will check whether strings are same?
    }
}
