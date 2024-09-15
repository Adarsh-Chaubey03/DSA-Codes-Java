import java.util.Scanner;
/*
=============================================================================================
||    SPACE COMPLEXITY-                                                                    ||
||    ----------------                                                                     ||
||    Best Case:      log n                                                                ||
||    Average Care:   log n                                                                ||
||    Worst Case:      n                                                                   ||
=============================================================================================

 * *
=============================================================================================
||    TIME COMPLEXITY-                                                                     ||
||    ----------------                                                                     ||
||    Best Case:        O(nlog(n))                                                         ||
||    Average Care:    O(nlog(n))                                                          ||
||    Worst Case:      O(n^2)  // can always be avoided                                    ||
=============================================================================================

* * in place

 */
public class QuickSort {
    static  void displayArr(int[] arr){
        for (int val: arr){
            System.out.print( val + " ");
        }
    }
    static void swap(int[] arr,int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y]= temp;
    }
    static int partition(int[] arr, int st, int end){
        int pivot = arr[st];
        int count = 0;
        for (int i = st+1; i <=end ; i++){
            if (arr[i] < pivot) count++;
        }
        int pivotIndex = st+ count;
        swap(arr, st, pivotIndex);
        int i = st, j= end;
        while (pivotIndex > i && j > pivotIndex){
            while (arr[i]<=pivot) i++;
            while (arr[j] > pivot) j++;

            if (i<pivotIndex){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }
    static void quickSort(int[] arr,int st, int end){
        if (st>=end) return;
        int pi = partition(arr,st,end);
        quickSort(arr,st,pi-1);
        quickSort(arr,pi+1,end);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Array before Sorting");
        displayArr(arr);
        System.out.println();

        quickSort(arr,0,n-1);

        System.out.println("Array After Sorting");
        displayArr(arr);
    }

}
