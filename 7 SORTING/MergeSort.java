/*
---------------------------------=============> MERGE SORT <==============----------------------------------------------
  * * divide into small problems using recursion

     ## Basic Algorithm-
        ----------------
     - divide the array into two equal half
     - solve them separately using recursion
     - merge two sorted sub arrays
 * *
-------------Space Complexity = O(n)------------------------------------------------------------------------------------
- no of stack frames = log(n)
space complexity = O(n)+log(n) => O(n)

 * *
=============================================================================================
||    TIME COMPLEXITY-                                                                     ||
||    ----------------                                                                     ||
||    Best Case:        O(nlog(n))                  * while loop unused                    ||
||    Average Care:    O(nlog(n))                                                          ||
||    Worst Case:      O(nlog(n))                                                          ||
=============================================================================================
* * stable sort
* * not an in place algorithm

*/
import java.util.Scanner;

public class MergeSort {
    static  void displayArr(int[] arr){
        for (int val: arr){
            System.out.print( val + " ");
        }
    }
    static void merge(int[] arr, int l, int mid,int r){
        // time complexity of this method is O(n)

        int n1= mid-l+1;
        int n2 = r-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i,j,k;

        for ( i =0; i < n1; i++){
            left[i]=arr[l+1];
        }

        for ( j =0; j < n2; j++){
            right[j]=arr[mid+1+j];
        }
        i=0;
        k=l;
        j=0;

        while (i<n1 && j< n2){
            if (left[i] <= right[j]){
                arr[k++]=left[i++];
            }
            else {
                arr[k++]=right[j++];
            }
        }
        while (i < n1){
            arr[k++]=left[i++];
        }
        while (j < n2){
            arr[k++]=right[j++];
        }
    }
    static void mergeSort(int[] arr, int l , int r){
    // time complexity of this method is O(n log(n))

        int mid = (l+r)/2;
        if (l>=r) return; // base case
        mergeSort(arr,l,mid);     // recursion
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r); // self work
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Array after sorting: ");
        displayArr(arr);

        mergeSort(arr,0,n-1);
        System.out.println();
        System.out.println("Array after sorting: ");
        displayArr(arr);
    }
}
