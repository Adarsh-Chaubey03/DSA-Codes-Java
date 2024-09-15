import java.util.Scanner;
// print the array recursively

public class RecursionOnArrays {
    static void printArray(int [] arr, int idx){
        if (idx == arr.length) {
            return;
        }
        System.out.println(arr[idx]);
        printArray(arr,idx+1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("printing array recursively: ");
        printArray(arr,0);
    }
}
