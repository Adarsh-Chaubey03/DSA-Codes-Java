import java.util.ArrayList;
import java.util.Scanner;
//print all the subsequences of a string
public class ArraylistSubsequences {
    //sequence-abc    (n=3)
    //subsequence- a, ab ,bc,ac,abc,b,c," " (no change in  order) TOTAL SUBSEQUENCE = 2^n
    static ArrayList<String> getSubsequence(String s){
        ArrayList <String> ans = new ArrayList<>();
        if (s.isEmpty()){ // base case
            ans.add("");
            return ans;
        } //recursive work
        ArrayList<String> smallAns = getSubsequence(s.substring(1));
        char ch = s.charAt(0);   // self work
        for (String ss : smallAns){
       ans.add(ss);
       ans.add(ch+ss);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<String> ans = getSubsequence(s);
        for (String ss : ans ){
           System.out.println(ss + " ");
        }
    }
}
