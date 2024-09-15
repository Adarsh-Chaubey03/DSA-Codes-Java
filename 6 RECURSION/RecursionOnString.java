import java.util.Scanner;
// remove all occurrences of a character from the string
public class RecursionOnString {
    static String removeOccurrences(String s, char ch, int idx){
     if (idx==s.length()){ // base case
         return "";
     }// recursive work
     String smallAns=removeOccurrences(s,ch,idx+1);
     // self work
        char ss= s.charAt(idx);
      if (ch!=ss) {
          return ss+smallAns;
      }else {
      return smallAns;
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);
        System.out.println(removeOccurrences(s,ch,0));
    }
}