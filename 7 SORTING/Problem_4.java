import java.util.Scanner;
/*
Given an array of positive and negative  integers, segregate them in linear time and constant space.
the output should print all negative number followed by all positive numbers
Input: [ 19 -20 7 -4 -13 11 -5 3 ]

Output:[ -20 -4 -13 -5 7 11 19 3 ]
 */
public class Problem_4 {
    static void orderInteger(int[] arr){
        int l =0;
        int n = arr.length-1;
while (l <n){
    while (arr[l]<0){
        l++;
    }
     while (arr[n]>= 0) {
         n--;
     }
      if (l < n) {
          int temp = arr[l];
          arr[l]=arr[n];
          arr[n]=temp;
          l++;
          n--;
      }
      }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i <n;i++) arr[i] = sc.nextInt();
        orderInteger(arr);
        QuickSort.displayArr(arr);
    }
}
