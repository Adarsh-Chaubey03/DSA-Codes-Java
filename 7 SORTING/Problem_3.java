import java.util.Scanner;

/*
given an array where all its elements are to be sorted in increasing order except two swapped
elements, sort it in linear time. Assume there are no duplicates in the array
Input: a[] = [3,8,6,7,5,9,10]
Output: a[]= [ 3,5,6,7,8,10]
 */
public class Problem_3 {
    static void sortIncreasing(int[] arr, int x){ //time complexity = n
        int m  =-1, p=-1;
        if (x<1) return; // corner case
       // process all adjacent array
       for (int i= 1 ; i < x ; i++) {
           if (arr[i-1] > arr[i]) {
                 if (m==-1){
                    m = i - 1;
                 }
               p = i;
           }
       }
       //swap m and p in arr
        int temp = arr[m];
       arr[m]=arr[p];
       arr[p]=temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i < n; i++){
            arr[i]=sc.nextInt();
        }
        sortIncreasing(arr,n);
        QuickSort.displayArr(arr);
    }
}
