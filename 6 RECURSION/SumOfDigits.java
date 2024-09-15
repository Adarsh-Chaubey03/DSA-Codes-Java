import java.util.Scanner;

// sum of digits of a number
public class SumOfDigits {
    static int sumOfDigit(int n){
  if (n >= 0 && n <= 9){ // base case
      return n;
  } // recursive work
   int smallAns = sumOfDigit(n/10);
   // self work
        return smallAns + n%10;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfDigit(n));
    }
}
