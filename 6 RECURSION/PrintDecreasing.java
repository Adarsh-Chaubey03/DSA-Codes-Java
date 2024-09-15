import java.util.Scanner;
// print all natural number from n to 1.
public class PrintDecreasing {
    static void printDecreasingOrder(int n) {
        // base case
        if (n == 1)
        {
            System.out.println(1);
            return;
        }

        //self work
        System.out.println(n);

        // recursive work
        printDecreasingOrder(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasingOrder(n);
    }
}
