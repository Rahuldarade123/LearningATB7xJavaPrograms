package ex_13072024;

public class tables {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= 10; i++) {
           //solution 1
            // System.out.printf("%d\t%d\t\n", i+"x"+n+"=", n*i);
            //System.out.println(n*i);

            // solution 2
            // System.out.printf("%d * %d=%d \n", n, i, n * i);

            //solution3
            System.out.println(n+"X"+i+"="+n*i);
        }
    }
}