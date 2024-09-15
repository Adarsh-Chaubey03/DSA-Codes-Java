import java.util.Scanner;
/*Given a number n .
print a matrix  of order n*n filled with elements 1 to n^2 in spiral order.
input :    3
output :   1    2    3
           4    5    6
           7    8    9
 */
public class CreateSpiral {
    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0 ; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + "  ");
            }
        }
        System.out.println();

    }
    static  int[][] generateSpiral(int n){
        int[][] matrix = new int [n][n];
        int topRow = 0, bottomRow = n-1, leftCol = 0, rightCol = n-1;
        int ce = 1; // ce -> current elements

        while (ce <= n*n){
            //topRow -> leftCol to rightCol
            for (int j= leftCol;j <= rightCol && ce <= n*n;j++){
               matrix[topRow][j]=ce++;
            }
            topRow++;


            //rightCol -> topRow to bottomRow
            for (int i = topRow ; i <= bottomRow && ce<= n*n ; i++){
                matrix[i][rightCol]=ce++;
            }
            rightCol--;


            //bottomRow -> rightCol to leftCol
            for (int j= rightCol ; j >= leftCol && ce<= n*n; j--){
                matrix[bottomRow][j]=ce++;
            }
            bottomRow--;


            //leftCol -> bottomRow to topRow
            for (int i = bottomRow ; i >= topRow && ce<= n*n; i--){
                matrix[i][leftCol]=ce++;
            }
            leftCol++;

        } return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the number n");
      int n = sc.nextInt();
      int [][] ans = generateSpiral(n);
      printMatrix(ans);
    }
}