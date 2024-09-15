import java.util.Scanner;

public class PrintArraySum {
    static int printSum(int[] arr, int idx) {
        if (idx == arr.length) { // self work
            return 0;
        }// recursive work
        int smallAns = printSum(arr, idx + 1);
        return smallAns + arr[idx]; // self work
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(printSum(arr, 0));
    }
}