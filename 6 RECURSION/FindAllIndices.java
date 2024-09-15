import java.util.Scanner;

public class FindAllIndices {
    static void printIndices(int[] arr, int target,int idx){
        // base case
        if (idx==arr.length){
            return;
        }
        // self work
        if (arr[idx]==target){
            System.out.println(idx);
        }
        // recursive work
        printIndices(arr, target, idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n; i++){
            arr[i]= sc.nextInt();
        }
        int target = sc.nextInt();
        printIndices(arr,target,0);
    }
}
