import java.util.Scanner;

/* count the number of occurrence  of an element x in the given array
* sample input:   arr = { 2,3,2,4,2,3,2,2}
* target number : 2
* sample output : 5
* */

public class NumberOfOccrurence {
    static int countOccurrence(int[] arr,  int x){
        int count =0;
        for (int y :arr){
            if (y==x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        System.out.println("enter "+ n + " elements of the array");
        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter target number");
        int x =sc.nextInt();
        System.out.println("count of "+x+ " is: "+ countOccurrence(arr,x));
    }
}
