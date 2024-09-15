import java.util.Scanner;
/* (TIME COMPLEXITY) ****************************************************************
        *
        *Best case: O(log n)
        *
        * Average case:
        *
        * worst case:
        *
        ************************************************************************************
        * space complexity = O(log n)
        ************************************************************************************

* not an in place
* */

public class RecursiveBinarySearch {
    static boolean binaryRecursion(int[] arr,int target,int end,int st){
        if (st>end) return false;
        int mid = (st+end)/2;
        if (arr[mid]==target){
            return true;
        } else if (target<arr[mid]){
            return binaryRecursion(arr,target,mid-1,st);
        }else {
            return binaryRecursion(arr,target,end,mid+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0; i < n; i++){
            arr[i]= sc.nextInt();
        }
        int  target = sc.nextInt();
        System.out.println(binaryRecursion(arr,target,n-1,0));
    }
}
