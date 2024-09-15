import java.util.Scanner;

public class RecursionBasic {
 static void printIncreasing(int n) { // 1,2,3....,n-1,n
      if (n==1){ // stack_overflow_error if the base case is not mentioned
          // it protects from the infinite recursion : Halting condition or Base case
          System.out.print(n + " "); //1
          return;
      }
      printIncreasing(n-1); // 1,2,3,4,...n-1  // recursive work
      System.out.print(n + " ");  //n        self work
  }
    public static void main(String[] args) {
      /* ------------- recursive function -------------
       * a function calling itself with different parameter and a halting condition and abase case
       to terminate the infinite loop
       * bigger problem solved by solving smaller sub problems
       * function is called to solve its sub problems
 */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        Example - Print all natural number from 1 to n
        printIncreasing(n);
    }
}
