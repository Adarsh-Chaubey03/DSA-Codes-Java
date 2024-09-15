import java.util.Scanner;
// find p raised to the power q
public class PowerOfNumbers {
    static int powerOfNumber(int n, int p ){
        // base case
        if (p==0){
            return 1;
        }
        // recursive work
        int smallAns = powerOfNumber(n,p-1);
        // self work
        return smallAns* n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit");
        int n = sc.nextInt();
        System.out.println("Enter the power");
        int p = sc.nextInt();
        System.out.println(powerOfNumber(n,p));
    }
}
