import java.util.Scanner;

public class PalindromeString {

        static String reverseString(String s, int idx){
            if (idx==s.length()){ // base case
                return "";
            }
            String smallAns=reverseString(s,idx+1); // recursive work
            return smallAns+s.charAt(idx); // self work
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String r =reverseString(s,0);
        if (r.equals(s)){
             System.out.println("Palindrome");         }else {
              System.out.println("Not A Palindrome");
         }
        }
    }
