import java.util.Scanner;

class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r, c;

        System.out.print("Enter number of rows: ");
        r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        c = sc.nextInt();

        int A[][] = new int[r][c];
        int B[][] = new int[r][c];
        int Sum[][] = new int[r][c];

        // Input first matrix
        System.out.println("Enter elements of first matrix:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements of second matrix:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Addition
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                Sum[i][j] = A[i][j] + B[i][j];
            }
        }

        // Display result
        System.out.println("Resultant Matrix:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(Sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}




