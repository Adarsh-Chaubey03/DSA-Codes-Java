import java.util.Arrays;
import java.util.Scanner;

// Generate all the string of n bits. Assume A[0,1,_N-1] be the array of size N.
public class Binary {
    static void binary(int n , int[] arr){ // time optimal
        if(n<1){
            System.out.println(Arrays.toString(arr));
        }else {
              arr[n - 1]=0;
        binary(n-1,arr);
        arr[n-1]=1;
        binary(n-1,arr);

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        binary(n,arr);
    }
}
