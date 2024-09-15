import java.util.Scanner;

// print factorial
public class Factorial {
    static  int printFactorial(int n){
        if ( n ==0){
          return 1;
        }
        int  smallAns = printFactorial(n-1);  // recursive work
        return n * smallAns; // self work
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println( printFactorial(n));
    }
}
