import java.util.Scanner;
//find 1 - 2 + 3 -4 .......n
public class AlternativeSignSum {
    static int alternateSum(int n) {
        if (n == 0) {
            return 0;
        }
        int smallAns=alternateSum(n-1);
        if(n%2==0) {
            return smallAns - n;
        }else {
            return smallAns + n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(alternateSum(n));
    }
}

