import java.util.Scanner;

public class TransposeOfAMatrix {
    static  int[][] findTranspose(int[][] matrix, int r, int c){
        int [][] ans = new int  [r][c];
        for (int i =0; i<c ; i++){
            for (int j = 0; j<r ; j++){
                ans[i][j]=matrix[j][i];
            }
        } return ans;
    }

    static void printMatrix(int [][] matrix){
        for(int i = 0; i< matrix.length;i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.println(matrix[i][j]+  " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the matrix ");
        System.out.println("enter the number of row in matrix ");
        int r = sc.nextInt();
        System.out.println("enter the number of column in matrix ");
        int c = sc.nextInt();
        System.out.println("enter " + r * c + " elements");
        int[][] matrix= new int[r][c];

        for (int i = 0; i < r; i++) {    // row
            for (int j = 0; j < c; j++) {              // column
                matrix[i][j] = sc.nextInt();
            }
        }
        int[][] ans = findTranspose(matrix,r,c);
        printMatrix(ans);
    }
}
