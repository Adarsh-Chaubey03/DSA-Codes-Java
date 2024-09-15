import java.util.ArrayList;
import java.util.Scanner;
// print all indices of an element in the array using recursion
public class ArraylistOfAllIndices {
    static ArrayList<Integer> allIndices(int [] arr,int n , int target, int idx){
        // base case
        if (idx==n){
            return new ArrayList<>(); // return empty arraylist
        }
        ArrayList<Integer> ans = new ArrayList<>();
        // self work
        if (arr[idx]==target) {
            ans.add(idx);
        }
        // recursive work
        ArrayList<Integer> smallAns = allIndices(arr,n,target,idx+1);
       ans.addAll(smallAns);
       return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n +" elements of the array");
        for (int i = 0; i < n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the target  element to print its all indices");
        int target =sc.nextInt();
ArrayList<Integer> ans = allIndices(arr,n,target,0);
    for (Integer i: ans){
        System.out.print(i + " ");
    }
    }
}
