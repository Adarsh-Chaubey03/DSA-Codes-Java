import java.util.Scanner;

/*
find the first occurrence of a given element x, given that the given array is sorted
If no occurrence of  x is found return -1;
input: 2, 5 ,6 ,7 ,7
x:5
output: 1
 */
public class P1_FirstOccurrence {
    static int firstOccurrence(int[] arr, int target, int end , int st) {
    int fo= -1;
    while (st <= end){
        int mid = st + (end-st)/2;
        if (arr[mid]==target){
            fo=mid;
            end= mid -1;
        } else if (target<arr[mid]){
          end= mid-1;

        }else {
            st=mid+1;
        }
    }
    return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0; i < n; i++){
            arr[i]= sc.nextInt();
        }
        int  target = sc.nextInt();
        System.out.println(firstOccurrence(arr,target,n-1,0));
    }
    }


