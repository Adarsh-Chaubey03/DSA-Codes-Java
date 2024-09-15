import java.util.Arrays;
import java.util.Scanner;

/* using selection sort fruits name in lexicographical order
input: apple , orange , mango , guava , grapes
output:apple, grapes, guava , mango , orange
 */
public class Problem_2 {
    static void lexicography(String[] str , int n){
        for (int i =  0 ; i < n-1 ; i++){
            int min_index = i;
            for (int j = i + 1; j < n ; j++){
                if (str[j].compareTo(str[min_index])<0){
                    min_index = j;
                }
            }
            // swap str[min_index],str[i]
            String temp = str[i];
            str[i]=str[min_index];
            str[min_index]=temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of names");
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++){
             str[i] = sc.next();
        }
        lexicography(str,n);
        System.out.println(Arrays.toString(str));
    }
}
