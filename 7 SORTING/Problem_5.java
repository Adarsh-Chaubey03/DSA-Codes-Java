import java.util.Scanner;

/*
Given an array of size N only 0s, 1s and 2s; sort the array in the ascending order.
Input:
N=6
arr[] = { 0 2 1 2 0 0 }
Output: 0 0 0 1 2 2
 */
public class Problem_5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i=0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        CountSort.countSort(arr);
        QuickSort.displayArr(arr);
    }
}
