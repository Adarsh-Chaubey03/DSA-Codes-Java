import java.util.Scanner;

public class SearchArrayElement {
    static boolean searchElement(int[] arr, int idx , int target){
        if (idx== arr.length){ // base case
            return false;
        } // recursive work
        searchElement(arr,idx+1,target);
        // self work
        return arr[idx] == target;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n; i++){
            arr[i]= sc.nextInt();
        }
        int target = sc.nextInt();
    if (searchElement(arr,0,target)){
        System.out.println("Yes");
    }else
    {
        System.out.println("No");
    }
    }
}
