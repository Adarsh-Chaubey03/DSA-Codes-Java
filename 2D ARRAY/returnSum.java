import java.util.Scanner;

public class returnSum {
    static int findSum(int [][] matrix, int l1, int l2, int r1, int r2){
        int sum =0;
        for (int i =l1; i <= l2; i++){
            for (int j=r2 ; j <= r2; j++){
                sum+=matrix[i][j];
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] matrix = new int[r][c];
        System.out.println("Enter "+ r*c + " elements");
        for (int i=0; i<r; i++){
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the rectangle boundaries l1 , l2 , r1 and r2");
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println("Rectangle Sum : " + findSum(matrix,l1,l2,r1,r2));
    }
}
