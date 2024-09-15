import java.util.Scanner;

/*
There are N stones , numbered 0,1,2,3,.....N-1. For each i (0<=i<=N), the height of stone ith is hi .
There is a frog who is initially on stone 0; He will repeat the following action some number of times to reach stone N-1:
If the frog is currently pn stone i , jump to stone i +1 or i +2.
here , a cost of |hi-hj| is incurred, where j is the stone to land on
find the minimum possible total cost incurred before the frog reaches the stone N.

Input: n=4
arr[]= 10 30 40 20
Output: 30

0 -> 1 -> 2 -> 3 cost = 50
0 -> 2 -> 3 cost = 50
0 -> 1 -> 3 cost = 30 // minimum cost => output

*/
public class FrogProblem {
    static int findMinimum(int[] h, int n,int idx){
        if (idx==n-1){ // base case
            return 0;
        }
        int price = Math.abs(h[idx]-h[idx+1]);
        // recursive work
        int ans_1 =price+findMinimum(h,n,idx+1);
        if (idx==n-2){ // base case
            return ans_1;
        }
        int ans_2 =price+findMinimum(h,n,idx+2);
        // self work
        return Math.min(ans_1,ans_2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i ++){
            h[i]= sc.nextInt();
        }
        System.out.println(findMinimum(h,n,0));
    }
}
