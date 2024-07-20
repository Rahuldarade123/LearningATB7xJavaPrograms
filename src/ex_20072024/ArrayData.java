package ex_20072024;

public class ArrayData {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        System.out.println(arr[2]);
         arr[2]=303;
        System.out.println(arr[2]);
//another way to intialoze

        System.out.println("New method");
        int[] arr2=new int[5];
    arr2[0]=10;
        arr2[1]=20;
        System.out.println(arr2[0]);
        System.out.println(arr2[4]);

        System.out.println("String array0");

        String[] str=new String[6];
        str[0]="ABC";
        str[1]="DEF";
        str[2]="HIJ";
        str[3]="KLM";
        str[4]="PQR";
        str[5]="XYZ";
        System.out.println("Lenth of array is " + str.length);

for( int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }

    }
}
