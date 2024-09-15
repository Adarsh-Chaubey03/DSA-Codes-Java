import java.util.Scanner;

public class MatricesMultipliation {
 static void printMatrix(int [][] matrix){
     for(int i = 0; i< matrix.length;i++){
         for (int j = 0; j < matrix[i].length; j++){
             System.out.println(matrix[i][j]+  " ");
         }
         System.out.println();
     }
 }
 static void multiply(int[][] a, int r1, int c1, int[][] b,int r2,int c2){
     if (c1 != r2){
         System.out.println("invalid input matrix multiplication not possible");
         return;
     }
     int [][] multiply=  new int [r1][c2];
     for (int i =0; i < r1;i++){
         for (int j =0; j < c2; j++){
             for (int k = 0; k < c1; k++){
                 multiply[i][j] += a[i][k] + b[k][j];
             }
         }
     }
     System.out.println("Multiplication Of Two Matrices");
     printMatrix(multiply);
 }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking matrix 1 input form user
        System.out.println("enter the matrix 1");
        System.out.println("enter the number of row in matrix 1");
        int r1 = sc.nextInt();
        System.out.println("enter the number of column in matrix 1");
        int c1 = sc.nextInt();
        System.out.println("enter " + r1 * c1 + " elements");
        int[][] a = new int[r1][c1];

        for (int i = 0; i < r1; i++) {    // row
            for (int j = 0; j < c1; j++) {              // column
                a[i][j] = sc.nextInt();
            }
        }
        // taking matrix 2 input from the user
        System.out.println("enter the matrix 1");
        System.out.println("enter the number of row in matrix 2");
        int r2 = sc.nextInt();
        System.out.println("enter the number of column in matrix 22");
        int c2 = sc.nextInt();
        System.out.println("enter " + r2 * c2 + " elements");
        int[][] b = new int[r1][c1];

        for (int i = 0; i < r2; i++) {    // row
            for (int j = 0; j < c2; j++) {              // column
                b[i][j] = sc.nextInt();

            }
        }
        multiply(a,r1,c1,b,r2,c2);
    }
}
