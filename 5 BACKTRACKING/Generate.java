import java.util.Arrays;
import java.util.Scanner;
// generate all string of length n and draw from 1 to k-1
public class Generate {
    static void k_array(int n, int k,int[] arr){
        if (n < 1){
            System.out.println(Arrays.toString(arr));
        }
        else {
            for (int i = 0; i< k; i++){
                arr[n-1]=i;
                k_array(n-1,k,arr);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = sc.nextInt();
        k_array(n,k,arr);
    }
}


