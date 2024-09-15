import java.util.Scanner;

public class PrintSubsequence {
    static void printSubsequence(String s,String ch){
        if (s.isEmpty()) {
            System.out.println(ch);
            return;
        }
    char cc = s.charAt(0); //a
    String remString = s.substring(1); // bc
        // cc be a part of ch
      printSubsequence(remString,ch+cc);
        // cc not ot be a part of ch
      printSubsequence(remString,ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); //abc
        printSubsequence(s,"");
    }
}
