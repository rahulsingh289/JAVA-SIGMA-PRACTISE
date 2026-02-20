 /* Write a Java program to create a class called ArrayDemo and overload arrayFunc() function.
     void arrayFunc(int [], int) ➔To find all pairs of elements in an Array whose sum is
     equal to a given number : Array numbers= [4, 6, 5,
        Output :
        -10, 8, 5, 20], target=10
     Pairs of elements whose sum is 10 are :
        4 + 6 = 10
        5 + 5 = 10
        -10 + 20 = 10
    void arrayFunc(int A[], int p, int B[], int q)➔ Given two sorted arrays A and B of
    size p and q, Overload method arrayFunc() to merge elements of A with B by maintaining
    the sorted order i.e. fill A with first p smallest elements and fill B with remaining elements.
        Example:
        Input :
        int[] A = { 1, 5, 6, 7, 8, 10 }
        int[] B = { 2, 4, 9 }

        Output:
        Sorted Arrays:
        A: [1, 2, 4, 5, 6, 7]
        B: [8, 9, 10]
        (Use Compile time Polymorphism Method Overloading)
        */


        import java.util.Arrays;

class ArrayDemo {

    // Method 1: Find all pairs in an array whose sum equals target
    void arrayFunc(int[] arr, int target) {
        System.out.println("Pairs of elements whose sum is " + target + " are:");
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) { // allow pair with same element
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No pairs found.");
        }
    }

    // Method 2: Merge two sorted arrays, maintaining sorted order
    void arrayFunc(int[] A, int p, int[] B, int q) {
        int[] merged = new int[p + q];

        // Copy elements into merged array
        for (int i = 0; i < p; i++) merged[i] = A[i];
        for (int i = 0; i < q; i++) merged[p + i] = B[i];

        // Sort merged array
        Arrays.sort(merged);

        // Fill A with first p elements, B with remaining q elements
        for (int i = 0; i < p; i++) A[i] = merged[i];
        for (int i = 0; i < q; i++) B[i] = merged[p + i];

        // Display the sorted arrays
        System.out.println("Sorted Arrays:");
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));
    }
}

// Demo program
public class Que10 {
    public static void main(String[] args) {
        ArrayDemo ad = new ArrayDemo();

        // First example: find pairs
        int[] arr = {4, 6, 5, -10, 8, 5, 20};
        int target = 10;
        ad.arrayFunc(arr, target);

        System.out.println("\n--- Merge Sorted Arrays Example ---");

        // Second example: merge sorted arrays
        int[] A = {1, 5, 6, 7, 8, 10};
        int[] B = {2, 4, 9};
        ad.arrayFunc(A, A.length, B, B.length);
    }
}

