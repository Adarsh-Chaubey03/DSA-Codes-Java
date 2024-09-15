import java.util.Scanner;

public class FindFirstAndLastIndex {

    static int searchElement(int[] arr, int idx , int target){
        if (idx== arr.length){ // base case
            return -1;
        }
        // self work
        if ( arr[idx] == target){
            return idx;
        }
        // recursive work
        return searchElement(arr, idx+1, target);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n; i++){
            arr[i]= sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(searchElement(arr,0,target));
    }
}
