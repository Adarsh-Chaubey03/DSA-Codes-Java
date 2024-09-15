import java.util.Arrays;
import java.util.Scanner;

/* send all the 0's at the end of  the array without changing the order of non-zero
elements
*/
public class Problem_1 {
    static void printArray(int[] arr, int n){
        for (int i = 0 ; i < n-1 ; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j]==0 && arr[j+1]!=0){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc. nextInt();
        }
        printArray(arr,n);
    }
}
