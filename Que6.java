  /*The problem to rearrange positive and negative numbers in an array .
    Method: This approach moves all negative numbers to the beginning and positive
     numbers to the end but changes the order of appearance of the elements of the array.
    Steps:
       1. Declare an array and input the array elements.
       2. Start traversing the array and if the current element is negative, swap the
          current element with the first positive element and continue traversing until all the
          elements have been encountered.
       3. Print the rearranged array.
           Test case:
            • Input: 1 -1 2 -2 3 -3
            • Output: -1 -2 -3 1 3 2. */

     import java.util.Scanner;

     public class Que6 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Rearrange negative and positive numbers
        int left = 0; // pointer for first positive element
        int right = 0; // pointer to traverse array

        while (right < n) {
            if (arr[right] < 0) {
                // swap arr[left] and arr[right]
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
            right++;
        }

        // Print rearranged array
        System.out.println("Rearranged Array (Negative first, Positive later):");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
