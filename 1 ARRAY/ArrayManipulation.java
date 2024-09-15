import java.util.Scanner;
// find the max element of an array
public class ArrayManipulation {
    static int findMax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length ; i++){
            if (arr[i] > mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF AN ARRAY");
        int n = sc.nextInt();
        System.out.println("Enter elements of the array");
        int[] arr = new int[n];
        for (int i =0; i < n ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the maximum value in this array is "  + findMax(arr));
    }
}
