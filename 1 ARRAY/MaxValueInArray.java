import java.util.Scanner;

/* calculate the maximum value in the given array
* sample input arr = 1 3 5
* sample output = 5
*/
public class MaxValueInArray {
 void maxValue(int[] arr){
     int ans = 0;
     int n = arr.length;
     for ( int i = 0; i<n ; i++) {
         if (arr[i] > ans){
             ans=  arr[i];
         }
     }
     System.out.println("maximum value in the given  array is: "+ans);
 }
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
        System.out.println(" enter the size of array");
     int n = sc.nextInt();
        System.out.println(" enter the elements of the array of size "+ n);
     int[] arr = new int[n];
     for (int i =0;i<n ; i++){
         arr[i]= sc.nextInt();
        }
     MaxValueInArray OB= new MaxValueInArray();
        OB.maxValue(arr);


    }
}

