import java.util.Scanner;

/*--------------========> RADIX SORT <=========----------
* * Digit by digit sorting
   -----------------------
   ** based on place value
   * ones ,tens hundreds....place
   *
   * =============================================================================================
||    SPACE COMPLEXITY-                                                                    ||
||    ----------------                                                                     ||
||    Best Case:      n                                                                    ||
||    Average Care:   n                                                                    ||
||    Worst Case:     n                                                                    ||
=============================================================================================

 * *
=============================================================================================
||    TIME COMPLEXITY-                                                                     ||
||    ----------------                                                                     ||
||    Best Case:    dn                                                                     ||
||    Average Care: dn                                                                     ||
||    Worst Case:   dn       (d= no. of digit in maximum no. present in element)           ||
=============================================================================================

*/
public class RadixSort {
    static int findMax(int[] arr){
        int mx= Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > mx) {
                mx = j;
            }
        }
        return mx;
    }
    static void countSort(int [] arr,int place){
        int n = arr.length;
        int[] output = new int[n];
        int max = findMax(arr);
        // frequency array
        int[] count = new int[max+1];
        for (int j : arr) {
            count[(j / place) % 10]++;
        }
        // make prefix sum array of count array
        for (int i =1; i< count.length; i++){
            count[i] += count[i-1];
        }
        // find index of each element in the original array and put it in output array
        for(int i = n-1; i >= 0; i--){
            int idx = count[(arr[i]/place) %10]-1;
            output[idx]=arr[i];
            count[(arr[i]/place) %10]--;
        }
        //copy all elements of output to array
        System.arraycopy(output, 0, arr, 0, n); //arr[i]=output[i]
    }

    static void radixSort(int[] arr){
        int max = findMax(arr);
        // applying counting sort to sort elements based on place values
       for (int place=1; max/place > 0 ; place += 10)
        countSort(arr,place);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i]= sc.nextInt();
        }
        radixSort(arr);
        QuickSort.displayArr(arr);
    }
}
