package ex_20072024;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        int[] arr= new int[3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Ebter first Number");
        arr[0] =sc.nextInt();
        System.out.println("Enter second Number");
        arr[1] =sc.nextInt();
        System.out.println("Enter Third Number");
        arr[2] =sc.nextInt();

        int arr2[]={2*arr[0],2*arr[1],2*arr[2]};
        System.out.println("Array 2 is");
        for (int i : arr2) {
            System.out.println(i);
        }
        //for(int i=0;i<arr2.length; i++){
          //  System.out.println(arr2[i]);
        //}

    }
}
