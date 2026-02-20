 /* Program to find if the given numbers are Friendly pair or not (Amicable or not).
  Friendly Pair are two or more numbers with a common abundance. Input & Output format:
  • Input consists of 2 integers.
  • The first integer corresponds to number 1 and the second
    integer corresponds to number 2.
  • If it is a Friendly Pair display Friendly Pair or displays Not Friendly Pair.
   For example,6 and 28 are Friendly Pair.
   (Sum of divisors of 6)/6 = (Sum of divisors of 28)/28.
  Steps to check whether the given numbers are friendly pair or not
   • Input the numbers num1 and num2.
   • Initialize sum1 = sum2 = 0.
   • sum1 = sum of all divisors of num1.
   • sum2 = sum of all divisors of num2.
   Program to check whether the given numbers are friendly pair or not.  */

    import java.util.Scanner;

    public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum1 = 0, sum2 = 0;

        // Calculate sum of divisors for num1
        for (int i = 1; i <= num1 / 2; i++) {
            if (num1 % i == 0) {
                sum1 += i;
            }
        }

        // Calculate sum of divisors for num2
        for (int i = 1; i <= num2 / 2; i++) {
            if (num2 % i == 0) {
                sum2 += i;
            }
        }

        // Calculate abundance (sum of divisors / number)
        double abundance1 = (double) sum1 / num1;
        double abundance2 = (double) sum2 / num2;

        // Check if friendly pair
        if (abundance1 == abundance2) {
            System.out.println(num1 + " and " + num2 + " are Friendly Pair");
        } else {
            System.out.println(num1 + " and " + num2 + " are Not Friendly Pair");
        }

        sc.close();
    }
}
