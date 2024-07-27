package ex_20072024;

public class FindMaxArray {
    public static void main(String[] args)
    {
       //System.out.println("Largest in given array is " + largest());
        //another method1 calling static method

        int A= FindMaxArray.largest();
        System.out.println("Max number is" +A);

    }
    static int arr[] = { 9, 324, 45, 90, 9808,-1,-200 };

    // Method to find maximum in arr[]
    static int largest()
    {

        // Initialize maximum element
        int max = arr[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
