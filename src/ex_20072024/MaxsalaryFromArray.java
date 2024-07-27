package ex_20072024;

import java.util.Scanner;

public class MaxsalaryFromArray {
    public static void main(String[] args) {
        int[] arr=new int [4];
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 1st number ");
         arr[0] =scan.nextInt();
        System.out.println("Enter 2st number ");
        arr[1] =scan.nextInt();
        System.out.println("Enter 3st number ");
        arr[2] =scan.nextInt();
        System.out.println("Enter 4st number ");
        arr[3] =scan.nextInt();
        System.out.println("Your array is");

for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);

}
        System.out.println("Max number is below");
int max=arr[0];
for(int j=0;j<arr.length;j++){
    if (arr[j]>max){
       max=arr[j];
    }
}
        System.out.println("MAx number is "+max);

    }
}