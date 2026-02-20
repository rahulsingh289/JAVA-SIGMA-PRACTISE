  /* Using the switch statement, write a menu-driven program to calculate the maturity 
  amount of a bank deposit. The user is (i) Term Deposit (ii) Recurring Deposit
  For option (i) accept Principal (p), rate of interest (r) and time period in years (n).
   Calculate and output the maturity amount (a) receivable using the formula a =
   p[1 + r / 100]^n. For option (ii) accept monthly installment (p), rate of interest (r) 
   and time period in months (n). Calculate and output the maturity amount (a) receivable using
   the formula a = p * n + p * n(n + 1) / 2 * r / 100 * 1 / 12. For an incorrect option, 
   an appropriate error message should be displayed.[ Use Scanner Class to take input] */


      import java.util.Scanner;

      public class Que2 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter choice");
        System.out.println("1 for Term Deposit, 2 for Recurring Deposit");

        int input = sc.nextInt();

         switch (input) {

            case 1:
                System.out.println("Enter principal amount");
                double p = sc.nextDouble();

                System.out.println("Enter rate of interest");
                double r = sc.nextDouble();

                System.out.println("Enter time period in years");
                double n = sc.nextDouble();

                double a = p * Math.pow((1 + r / 100), n);
                System.out.println("Amount is: " + a);
                break;

            case 2:
                System.out.println("Enter monthly installment");
                double pm = sc.nextDouble();

                System.out.println("Enter rate of interest");
                double rate = sc.nextDouble();

                System.out.println("Enter time period in years");
                double years = sc.nextDouble();

                double months = years * 12;
                double amount = pm * months +
                        (pm * months * (months + 1) / 2) * (rate / 100) * (1.0 / 12);

                System.out.println("Amount is: " + amount);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
