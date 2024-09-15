import java.util.Scanner;

public class SeriesSum {
    static int seriesSums(int n){
        if (n==0){ // base case
            return 0;
        }
        int smallAns=seriesSums(n-1);
        // self work
        return smallAns + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(seriesSums(n));
    }
}
