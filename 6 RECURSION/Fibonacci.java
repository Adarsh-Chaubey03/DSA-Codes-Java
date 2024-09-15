import java.util.Scanner;
 // print nth fibonacci number
public class Fibonacci {
    static int fibonacci(int n){
        if (n == 0 || n == 1){
            return n;
        } // recursive work
         int prev=fibonacci(n-1);
        int prevPrev= fibonacci(n-2);
        // self work
        return prev + prevPrev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}
