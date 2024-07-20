package ex_20072024;

public class MaxsalaryFromArray {
    public static void main(String[] args) {
        int[] arr={30,50,60,90,10,100,999};
if(arr[0]>arr[1] && arr[1]>arr[2] && arr[2]>arr[3] && arr[3]>arr[4] && arr[4]>arr[5] && arr[5]>arr[6] && arr[0]>arr[6]){
    System.out.println("Max number is"+ arr[0]);
}
else if(arr[1]>arr[0] && arr[0]>arr[2] && arr[2]>arr[3] && arr[3]>arr[4] && arr[4]>arr[5] && arr[5]>arr[6] && arr[1]>arr[6]){

    System.out.println("Max number is"+arr[1]);
}
//arr[]2
else if(arr[2]>arr[0] && arr[0]>arr[1] && arr[1]>arr[2] && arr[2]>arr[3] && arr[3]>arr[4] && arr[4]>arr[5] && arr[5]>arr[6]){

    System.out.println("Max number is"+arr[2]);
}
//arr[3]
else if(arr[3]>arr[0] && arr[1]>arr[2] && arr[2]>arr[3] && arr[3]>arr[4] && arr[4]>arr[5] && arr[5]>arr[6]){

    System.out.println("Max number is"+arr[3]);
}
//arr[4]
else if(arr[1]>arr[1] && arr[1]>arr[2] && arr[2]>arr[3] && arr[3]>arr[4] && arr[4]>arr[5] && arr[5]>arr[6]){

    System.out.println("Max number is"+arr[4]);
}
//arr[5]
else if(arr[1]>arr[1] && arr[1]>arr[2] && arr[2]>arr[3] && arr[3]>arr[4] && arr[4]>arr[5] && arr[5]>arr[6]){

    System.out.println("Max number is"+arr[5]);
}
//arr[6]
else if(arr[1]>arr[1] && arr[1]>arr[2] && arr[2]>arr[3] && arr[3]>arr[4] && arr[4]>arr[5] && arr[5]>arr[6]){

    System.out.println("Max number is"+arr[6]);
}




    }
}
