import java.util.Scanner;

/* search the index of an element x in the given array
sample input arr = 2,3,4,5,6
 x= 5;
 sample output = found 5 at index 3!
 */
public class SearchAnArray {
    void findIndex( int [] arr,int t){
        int ans = -1;
        int n = arr.length;
        for (int i = 0; i < n; i++){
            if (arr[i]== t){
                ans =i;
            }
        }
        if (ans== -1){
            System.out.println("not  found");
        } else {
            System.out.println("found "+ t + " at index "+ ans);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the size of array");
        int n = sc.nextInt();
        System.out.println("enter the elements of the array of size "+n);
        int [] arr = new int[n];
        for (int i = 0; i<n ;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target elements");
        int t = sc.nextInt();
        SearchAnArray obj = new SearchAnArray();
        obj.findIndex(arr,t);
    }
}
