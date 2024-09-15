import java.util.Scanner;
/*
Given a string containing digits inclusively from 2-9.return all possible letter combinations that the
number could represent. Return answer in any order
Input:"23"
Output:["ad","ae","af","bd","be","bf","cd","ce","cf"]
keypad Mapping:
      ====================================================
      ||                                                ||
      ||       1              2                3        ||
      ||       -             abc              def       ||
      ||                                                ||
      ||       4              5                6        ||
      ||      ghi            jkl              mno       ||
      ||                                                ||
      ||       7              8                9        ||
      ||      pqrs           tuv              wxyz      ||
      ||                                                ||
      ||       *              0                #        ||
      ||                                                ||
      ====================================================
 */
public class KeypadCombination {
    static void combination(String digit,String[] kp,String res){
        if (digit.isEmpty()){
            System.out.println(res+" ");
            return;
        }
        int currNum = digit.charAt(0)-'0'; // 2
        String currChoices = kp[currNum]; // abc
       for (int i =0; i< currChoices.length();i++){
           combination(digit.substring(1),kp,res+currChoices.charAt(i));
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String digit = sc.next();
        //Keypad Mapping
        String[] kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        // index ->     0  1   2     3     4     5     6     7      8      9
    combination(digit,kp,"");

    }
}
