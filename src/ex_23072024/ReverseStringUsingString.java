package ex_23072024;

import java.util.Arrays;

import static java.util.Collections.reverse;

public class ReverseStringUsingString {
    public static void main(String[] args) {
        String str= new String();
        str="ABC";
        StringBuilder SB= new StringBuilder(str);
        String STR =SB.reverse().toString();
        System.out.println(STR);



    }
}
