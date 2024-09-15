import java.util.Scanner;
// find second max value of the array
public class SecondMax {
    static int findMax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length ; i++){
            if (arr[i] > mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static int findMaxSecond(int[] arr){
        int mx =findMax(arr);
        for (int i =0; i < arr.length; i++){
            if (arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }

        } int  secMax = findMax(arr);
        return secMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n elements");
        int n = sc.nextInt();
        System.out.println("Enter the elements of size  "+ n);
        int[] arr =new int[n];
        for (int i =0; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the second max value of the given array "+ findMaxSecond(arr));
    }
}
