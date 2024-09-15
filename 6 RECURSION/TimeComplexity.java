public class TimeComplexity {
    // Algorithm A1
    int sum(int n ) {      // 3n + 2 ~ 3n ~ n for (n  of order 10^8)
        int ans= 0; // 1 Operation
        for( int i = 0 /* 1 Operation   */ ; i < n; i++){
            ans += i;    // 3n Operations
        }
        return ans;  // 1 Operations
    }
    //Algorithm A2
    double sumOfNumber( double n){
        return n*(n+1)/2;   // total operations = 5
    }
 // B------- Traversing An Array
    void f1(int  [] arr){   // n iteration => 3n operation ~ n operations
        int n = arr.length;
        for(int i =0; i < n ; i++){
            System.out.println(arr[i]);
        }
    }

    //D- Nested Loop
    void f3( int n){
        /* 1i iteration = nj  operations
        n iterations = n * n operations
         */
        for (int i =0; i< n; i++){
            for (int j =0; j < n ; j++){
                System.out.println("hello");
            }
        }
    }
    public static void main(String[] args) {

        /* **********  Time complexity *********************
       * it is not exactly the overall running time of a program
       * because over all running time of a program depends on the following factors:
        1) Algorithm
        2) Language Java/C++ >> python
        3) Processors  i3 << M1Pro
        * The best algorithm is faster than other alternatives and is independent of above factor
        *
        * Example_A- find the sum of all numbers from 1 to n.
                        Algorithm A1 ------------------------- Algorithm A2
 Time complexity          O(n)                                         O(1)

      * -------- TYPES OF TIME COMPLEXITY ANALYSIS AND NOTATION

      TYPE                                   NOTATION

      * Worst Case Time Complexity           big O(n)
      * Best Case Time Complexity            big omega (1)
      * Average case Time Complexity         big theta (n)

common error TLE_ time limit exceeded

* EXAMPLE-

 B- Traversing An Array
 * O(n)  WCT

 C- Traversing 2 individual arrays of length n and m
 * O(n)    WCT

 D- Nested Loop
 * O(n*n)
 it is not necessary for a nested loop to have wct as O(n) always.

 E- traversing the array and multiply the increment pointer by 2
  int count = 0;
  for ( int i =0; i < n; i*=2){
  count++;
 }
 * O(K+1)~O(K)    WCT
where k = log n
i . e . final   WCT = O(log n)

 F- traversing the array and multiply the increment pointer by K
  int count = 0;
  for ( int i =0; i < N; i*=K){
  count++;
 }
    iteration no. ---------- i
    1                     1
    2                     k(=K^2-1)
    3                     K*k*k
    .                      .
    .                      .
    Pth                   k^p-1
    (p+1)th               k^p
 *
 * O(logN)  // base k            WCT
 * */
    }
}
