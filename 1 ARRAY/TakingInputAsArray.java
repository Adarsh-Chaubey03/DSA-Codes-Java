import java.util.Scanner;
public class TakingInputAsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  size of the  array") ;
        int n = sc.nextInt();
        int [] arr=  new int[n];
        System.out.println("enter the elements of the array");
        for(int i= 0; i < arr.length; i++){  //     taking input form user
           arr[i]= sc.nextInt();
        }
    }
}
