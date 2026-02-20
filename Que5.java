     /* Printing an array into Zigzag fashion. Suppose you were given an array of
      integers, and you are told to sort the integers in a zigzag pattern.
       In general, in a zigzag pattern, the first integer is less than the second integer,
     which is greater than the third integer, which is less than the fourth integer, and
      so on. Hence, the converted array should be in the form of e1 < e2 > e3 < e4 > e5 < e6.
      Test cases:
      Input 1:
            7
            4 3 7 8 6 2 1
            Output 1:
            3 7 4 8 2 6 1
            Input 2:
            4
            1 4 3 2
            Output 2:
            1 4 2 3 */

            
import java.util.Scanner;

public class Que5 {
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

        // Convert array into zigzag fashion
        boolean flag = true; // true means '<' relation expected, false means '>'
        for (int i = 0; i < n - 1; i++) {
            if (flag) { // "<" relation expected
                if (arr[i] > arr[i + 1]) {
                    // swap arr[i] and arr[i+1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } else { // ">" relation expected
                if (arr[i] < arr[i + 1]) {
                    // swap arr[i] and arr[i+1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            flag = !flag; // flip flag for next pair
        }

        // Print the zigzag array
        System.out.println("Zigzag Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}


