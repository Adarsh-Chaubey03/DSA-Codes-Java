import java.util.Scanner;

/* calculate the number of triplet whose sum eis equal to the given value x
sample arr input : 1 4 5 6 3
target= 12
sample output = 2    (1,5,6) & (4,5,3)
 */
public class TripletSum {
    static int tripleSum(int [] arr, int t){
        int ans =0;
        int n = arr.length;
        for (int i = 0; i<n; i++){
            for (int j=i+1; j<n; j++){
                for (int k = j+1; k<n; k++){
                    if (arr[i] + arr[j] + arr[k] == t){
                        ans++;

                    }
                }
            }
        } return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println(" enter the elements of array of size "+ n);
        for (int i =0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target  sum");
        int t =sc.nextInt();
        System.out.println("pairs of triplet: "+tripleSum(arr,t));
    }
}
