    /* Write a java program to create a class named 'Bank ' with the following data members:
        Name of depositor
        Address of depositor
        Account Number
       Balance in account
      Class 'Bank' has a method for each of the following:
      1 - Generate a unique account number for each depositor
    For first depositor, account number will be 1001, for second depositor it will be 1002 and so on
    2 - Display information and balance of depositor
    3 - Deposit more amount in balance of any depositor
    4 - Withdraw some amount from balance deposited
    5 - Change address of depositor 
     After creating the class, do the following operations
            1 - Enter the information (name, address, account number, balance) of the 
            depositors. Number of depositors is to be entered by user.
            2 - Print the information of any depositor.
            3 - Add some amount to the account of any depositor and then display final
                information of that depositor
            4 - Remove some amount from the account of any depositor and then display final
            information of that depositor
            5 - Change the address of any depositor and then display the final information
             of that depositor
            6 - Randomly repeat these processes for some other bank accounts.  */









                    import java.util.Scanner;

class Bank {
    private String name;
    private String address;
    private int accountNumber;
    private double balance;
    private static int nextAccountNumber = 1001; // Static counter for unique account numbers

    // Constructor to initialize depositor's info
    public Bank(String name, String address, double balance) {
        this.name = name;
        this.address = address;
        this.balance = balance;
        this.accountNumber = nextAccountNumber++; // Generate unique account number
    }

    // Method to display depositor information
    public void displayInfo() {
        System.out.println("----- Account Information -----");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("--------------------------------");
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println(amount + " withdrawn successfully.");
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to change address
    public void changeAddress(String newAddress) {
        this.address = newAddress;
        System.out.println("Address updated successfully.");
    }

    // Getter for account number
    public int getAccountNumber() {
        return accountNumber;
    }
}

public class Que8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of depositors: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        Bank[] depositors = new Bank[n];

        // Input information for each depositor
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for depositor " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();
            System.out.print("Initial Balance: ");
            double balance = sc.nextDouble();
            sc.nextLine(); // Consume newline
            depositors[i] = new Bank(name, address, balance);
            System.out.println("Account created successfully. Account Number: " + depositors[i].getAccountNumber());
        }

        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Bank Operations Menu ---");
            System.out.println("1. Display depositor info");
            System.out.println("2. Deposit amount");
            System.out.println("3. Withdraw amount");
            System.out.println("4. Change address");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1: {
                    System.out.print("Enter account number: ");
                    int accNum = sc.nextInt();
                    sc.nextLine();
                    Bank b = findDepositor(depositors, accNum);
                    if (b != null) {
                        b.displayInfo();
                    } else {
                        System.out.println("Depositor not found!");
                    }
                    break;
                }
                case 2: {
                    System.out.print("Enter account number: ");
                    int accNum = sc.nextInt();
                    sc.nextLine();
                    Bank b = findDepositor(depositors, accNum);
                    if (b != null) {
                        System.out.print("Enter amount to deposit: ");
                        double amount = sc.nextDouble();
                        sc.nextLine();
                        b.deposit(amount);
                        b.displayInfo();
                    } else {
                        System.out.println("Depositor not found!");
                    }
                    break;
                }
                case 3: {
                    System.out.print("Enter account number: ");
                    int accNum = sc.nextInt();
                    sc.nextLine();
                    Bank b = findDepositor(depositors, accNum);
                    if (b != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double amount = sc.nextDouble();
                        sc.nextLine();
                        b.withdraw(amount);
                        b.displayInfo();
                    } else {
                        System.out.println("Depositor not found!");
                    }
                    break;
                }
                case 4: {
                    System.out.print("Enter account number: ");
                    int accNum = sc.nextInt();
                    sc.nextLine();
                    Bank b = findDepositor(depositors, accNum);
                    if (b != null) {
                        System.out.print("Enter new address: ");
                        String newAddress = sc.nextLine();
                        b.changeAddress(newAddress);
                        b.displayInfo();
                    } else {
                        System.out.println("Depositor not found!");
                    }
                    break;
                }
                case 5:
                    exit = true;
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }

        sc.close();
    }

    // Helper method to find depositor by account number
    private static Bank findDepositor(Bank[] depositors, int accNum) {
        for (Bank b : depositors) {
            if (b.getAccountNumber() == accNum) {
                return b;
            }
        }
        return null;
    }
}



