import java.util.Scanner;

public class ReverseTheString {
static void reverseString(String s, int idx){
    if (idx==s.length()){ // base case
        return;
    }
    reverseString(s,idx+1); // recursive work
    System.out.print(s.charAt(idx)); // self work
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        reverseString(s,0);
    }
}
