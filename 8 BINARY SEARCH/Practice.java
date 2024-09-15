import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
     //   Scanner sc = new Scanner(System.in);
     /*  int [] arr = new int [2];
       for(int i = 0; i < 2;i++){
           arr[i] = sc.nextInt();
       }
        int [] brr = new int [2];
        for(int j = 0; j < 2;j++){
            brr[j] = sc.nextInt();
        }
        System.out.println(arr[0]*brr[0]+arr[1]+brr[1]);
}


        Scanner sc = new Scanner(System.in);

        }
           */
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt(); int count=0;
      for (int i =0; i < n;i++){
          int m = sc.nextInt();
          String str = sc.next();
          for (int j =0; j<m ; j++){
              char ch = str.charAt(j);
             if (ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ){
                 count=0;
             }else {
                 count++;
             }}
              if (count >3 ) {
                  System.out.println("NO");
              } else {
                  System.out.println("YES");
              } }
























































    }
}
