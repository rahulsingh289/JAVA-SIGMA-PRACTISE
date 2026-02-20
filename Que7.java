    /* Program to find the saddle point coordinates in a given matrix. A saddle point is
        an element of the matrix, which is the minimum element in its row and the maximum 
        in its column.
        For example, consider the matrix given below
        Mat[3][3]
        1 2 3
        4 5 6
        7 8 9
        Here, 7 is the saddle point because it is the minimum element in its row and maximum 
        element in its column.Steps to find the saddle point coordinates in a given matrix
        1. Input the matrix from the user.
        2. Use two loops, one for traversing the row and the other for traversing the column.
        3. If the current element is the minimum element in  its row and maximum element 
        in its column,then return its coordinates.
        4. Else, continue traversing. */



        import java.util.Scanner;

public class Que7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix size
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] mat = new int[rows][cols];

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        boolean found = false;

        // Traverse each row
        for (int i = 0; i < rows; i++) {
            // Find minimum element in row i
            int rowMin = mat[i][0];
            int colIndex = 0; // column of the minimum element
            for (int j = 1; j < cols; j++) {
                if (mat[i][j] < rowMin) {
                    rowMin = mat[i][j];
                    colIndex = j;
                }
            }

            // Check if rowMin is the maximum in its column
            boolean isSaddle = true;
            for (int k = 0; k < rows; k++) {
                if (mat[k][colIndex] > rowMin) {
                    isSaddle = false;
                    break;
                }
            }

            if (isSaddle) {
                System.out.println("Saddle point found at (" + i + ", " + colIndex + ") with value: " + rowMin);
                found = true;
                break; // stop after finding first saddle point
            }
        }

        if (!found) {
            System.out.println("No saddle point found in the matrix.");
        }

        sc.close();
    }
}


