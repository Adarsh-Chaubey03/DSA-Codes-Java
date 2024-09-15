import java.util.Scanner;

/*
---------------=========> COUNT SORT <=========---------------
 * non-comparison
 * Range of numbers defined
 * not an in place algorithm

 Ex-(A) Basic Count Sort-
    --------------------
 Array => 4 3 1 5 3 1 3 5
 frequency array:
 count  => 0 2 0 3 1 2
           0 1 2 3 4 5

 ans =>    1 1 3 3 3 4 5 5

 * stability is not considered in this algorithm
 (B)-Advanced Count Sort-
 -----------------------
 * make the algorithm stable
  Array => 4 3 1 5 3* 1* 3** 5*
 frequency array:
 count     =>  0 2 0 3 1 2
               0 1 2 3 4 5
 prefixSum =>  0 2 2 5 6 8  // count updated

 SmallAns =>  _  1*  _  _   3**  4   _  5*
 ans =>       1  1*  3  3*  3**  4   5  5*
 * *
=============================================================================================
||    SPACE COMPLEXITY-                                                                    ||
||    ----------------                                                                     ||
||    Best Case:                                                                      ||
||    Average Care:                                                                  ||
||    Worst Case:                                                                         ||
=============================================================================================

 * *
=============================================================================================
||    TIME COMPLEXITY-                                                                     ||
||    ----------------                                                                     ||
||    Best Case:                                                                 ||
||    Average Care:                                                              ||
||    Worst Case:                                         ||
=============================================================================================

 */
public class CountSort {
 // BASIC COUNT SORT
 static int findMax(int[] arr){
     int mx= Integer.MIN_VALUE;
     for (int j : arr) {
         if (j > mx) {
             mx = j;
         }
     }
     return mx;
 }

    static void basicCountSort(int [] arr){
    // find the largest element of the array
    int max = findMax(arr);
   // frequency array
    int[] count = new int[max+1];
    for (int j : arr) {
        count[j]++;
    }
    int k = 0;
    for (int i = 0; i < count.length;i++){
        for (int j = 0; j < count[i]; j++){
         arr[k++]=i;
        }
    }
    }

    // ADVANCED COUNT SORT
    static void countSort(int[] arr){
        int n = arr.length;
        int[] output = new int[n];
        int max = findMax(arr);
        // frequency array
        int[] count = new int[max+1];
        for (int j : arr) {
            count[j]++;
        }
        // make prefix sum array of count array
        for (int i =1; i< count.length; i++){
            count[i] += count[i-1];
        }
        // find index of each element in the original array and put it in output array
     for(int i = n-1; i >= 0; i--){
        int idx = count[arr[i]]-1;
        output[idx]=arr[i];
        count[arr[i]]--;
     }
     //copy all elements of output to array
        System.arraycopy(output, 0, arr, 0, n); //arr[i]=output[i]
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i]= sc.nextInt();
        }
        basicCountSort(arr);
        QuickSort.displayArr(arr);
        System.out.println();
        countSort(arr);
        QuickSort.displayArr(arr);

    }
}
