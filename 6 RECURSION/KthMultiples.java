import java.util.Scanner;
 // print k multiples of a number n
public class KthMultiples {
    static void multiples(int n, int k){
        if (k==1){ // base case
            System.out.print(n + " ");
            return;
        } // recursive  work
        multiples(n,k-1);
        System.out.print(n*k +"  "); // self work
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        System.out.println("enter the multiple times");
        int k = sc.nextInt();
        multiples(n,k);
    }
}
