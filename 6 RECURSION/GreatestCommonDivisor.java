import java.util.Scanner;
// find gcd of two numbers n and m
public class GreatestCommonDivisor {

    static int greatestDivisor(int n  , int m ){
/*
        //---------- iterative method--------------
        while (n%m !=0){
            int rem = n%m;
            n = m;
            m= rem;
        }
        return m;
  */
    // -------------recursion ----------------------
        // base case
        if (m==0){
            return n;
        }
         return greatestDivisor(m,n%m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(greatestDivisor(n,m));
    }
}
