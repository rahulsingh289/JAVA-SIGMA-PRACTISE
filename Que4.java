    /* Program to replace all 0's with 1 in a given integer. Given an integer as 
    an input, all the 0's in the number has to be replaced with 1.For example, consider
     the following number 
     Input: 102405
     Output: 112415
     Input: 56004
     Output: 56114
     Steps to replace all 0's with 1 in a given integer
     • Input the integer from the user.
     • Traverse the integer digit by digit.
     • If a '0' is encountered, replace it by '1'.
     • Print the integer. */



    import java.util.Scanner;

    public class Que4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the integer
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int result = 0;
        int place = 1; // to track the position of digits

        int temp = num;

        // Traverse each digit
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0) {
                digit = 1; // Replace 0 with 1
            }
            result = result + digit * place;
            place *= 10;
            temp /= 10;
        }

        System.out.println("Number after replacing 0's with 1: " + result);
        sc.close();
    }
}