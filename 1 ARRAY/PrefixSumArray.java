import java.util.Scanner;

// Given an integer array 'a'.Return the prefixSum/runningSum in the same array without creating a new array.
public class PrefixSumArray{
    static int [] makePrefixSumArray(int[] arr){
        int n = arr.length;
        int[] pref = new int[n];
        pref[0]=arr[0];
        for (int i =  0; i < n ; i++){
            pref[i]=pref[i-1] + arr[i];
        } return pref;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF AN ARRAY");
        int n = sc.nextInt();
        System.out.println("ENTER THE ELEMENTS OF ARRAY OF SIZE "+ n);
        int[] arr = new int[n];
        for(int i =0 ;i < n; i++){
           arr[i]=sc.nextInt();
        }
        int[] pref = makePrefixSumArray(arr);
        System.out.println(pref);
    }
}