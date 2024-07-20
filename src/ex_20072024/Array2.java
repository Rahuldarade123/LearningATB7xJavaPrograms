package ex_20072024;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[] arr1=new int[5];
        arr1[0]=10;
        arr1[1]=20;
        arr1[2]=30;
        arr1[3]=40;
        arr1[4]=50;

        int[] arr2=new int[5];
        arr2[0]=10;
        arr2[1]=20;
        arr2[2]=30;
        arr2[3]=40;
        arr2[4]=50;

        System.out.println(arr1==arr2);  // false it will check for refrences
        System.out.println(arr1.equals(arr2));  // false it will check for refrences
        System.out.println(Arrays.equals(arr1,arr2)); // true--it will check for comntent
        System.out.println(arr1.length);
for(int i=0;i<arr1.length;i++){
    System.out.println(arr1[i]);
}

    }
}
