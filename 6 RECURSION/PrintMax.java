import java.util.Scanner;

public class PrintMax {
static int printMaxValue(int[] arr, int idx){
    // base case
    if (idx == arr.length-1){
        return arr[idx];
    }
    // recursive work
    int smallAns= printMaxValue(arr, idx+1);
    // self work

    return Math.max(smallAns,arr[idx]);
}
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n ; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(printMaxValue(arr,0));
    }
}
