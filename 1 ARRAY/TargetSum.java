/* total number of pairs in the array whose sum is equal to the given value x
*  sample arr  input =  4 6  3 5 8 2
*  target sum = 7
*  sample output = 2
*  i.e. (4,3)  & (5,2)  */

import java.util.Scanner;

public class TargetSum {
    static int targetSum(int[] arr, int t){
        int n = arr.length;
        int ans =0;
        for (int i =0; i<n; i++){
            for (int j = i+1; j<n ; j++){
                if (arr[i]+arr[j]==t){
                    ans++;
                }
            }
        } return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE IF ARRAY");
        int n = sc.nextInt();
        System.out.println("ENTER THE ELEMENTS OF THE ARRAY OF SIZE "+ n);
        int [] arr = new int[n];
        for (int i = 0; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("ENTER TARGET SUM");
        int t =sc.nextInt();
        System.out.println("target sum pairs : "+ targetSum(arr,t));
    }
}

