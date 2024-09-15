import java.util.Scanner;

/*
-------------==========> Binary Search <==========----------------
# array must be sorted

* (TIME COMPLEXITY) ****************************************************************
 *
 *Best case: O(log n)
 *
 * Average case:
 *
 * worst case:
 *
 ************************************************************************************
 * space complexity = constant
 ************************************************************************************
 */
public class BinarySearchBasic {
    static boolean binarySearch(int[] arr, int target){
    int n = arr.length;
    int st = 0, end = n-1;
    while(st<=end){
        int mid =(st+end)/2; // BETTER: st + (end - st )/2
if (target==arr[mid]){
    return true;
} else if (target< arr[mid]){
    end = mid-1;
} else {
    st = mid+1;
      }
    }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0; i < n; i++){
            arr[i]= sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(binarySearch(arr,target));
    }
}
