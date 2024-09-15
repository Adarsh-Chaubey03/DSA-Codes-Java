import java.util.Scanner;

/* Calculate the sum of a given array
* sample input:  arr ={1,2,3,4}
* sample output: sum=10
* */
public class SumOfElements {
 static int sumArray(int[]  arr){
        int sum=0;
     for (int i=0;i<arr.length;i++){
            sum=sum+ arr[i];
        }
    return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = sc.nextInt();
        System.out.println("enter the elements of the array");
        int [] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sumArray(arr));
    }
}
