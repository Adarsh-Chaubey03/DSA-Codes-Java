/* input matrix
                 1      2      3
                 4      5      6
                 7      8      9

   output:      1      2     3    6    9    8     7    4    5
 */

import java.util.Scanner;

public class SpiralMatrix {
    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j =0; j < matrix[i].length; j++){
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void printSpiralMatrix(int[][] matrix,int r , int c){
        int topRow = 0, bottomRow = r-1, leftCol = 0, rightCol = c-1;
        int te = 0; // te -> total elements

        while (te < r*c){
            //topRow -> leftCol to rightCol
            for (int j= leftCol;j <= rightCol && te < r*c;j++){
                System.out.println(matrix[topRow][j]+ " ");
            }
            topRow++;
            te++;

            //rightCol -> topRow to bottomRow
            for (int i = topRow ; i <= bottomRow && te < r*c ; i++){
                System.out.println(matrix[i][rightCol]+ " ");
            }
            rightCol--;
            te++;

            //bottomRow -> rightCol to leftCol
            for (int j= rightCol ; j >= leftCol &&  te < r*c; j--){
                System.out.println(matrix[bottomRow][j] + " ");
            }
            bottomRow--;
            te++;

            //leftCol -> bottomRow to topRow
            for (int i = bottomRow ; i >= topRow && te < r*c; i--){
                System.out.println(matrix[i][leftCol]+" ");
            }
            leftCol++;
            te++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Matrix");
        System.out.println("Enter the number of row");
        int r = sc.nextInt();
        System.out.println("Enter the number of column");
        int c = sc.nextInt();
        System.out.println( " Enter "+ r*c + " elements");
        int [][] matrix = new int [r][c];
        for (int i = 0; i < r; i++){
            for (int j =0; j < c; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
       printSpiralMatrix(matrix,r,c);
    }
}
