public class ArrayLengthAndTraversing {
    public static void main(String[] args) {
        //**********************************  Length operation in array  ************************   //
         int  []  arr = {5,6,7,8};
        System.out.println("length of an array: "+ arr.length);  //4

        //************************** TRAVERSING AN ARRAY **********************************************     //
        /*
        1) for loop
        2) for each loop
        3) while loop
         */

        //        [1] for loop   (partial or full array)
        System.out.println(" this is printed using for loop ");
         int n = arr.length;
         for(int i = 0; i < n; i++){
             System.out.print(" " + arr[i]);
         }
        System.out.println(" are the element of given array");
        System.out.println();



         // [2] for each loop          (only full array ca be traversed)

        for (int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println();



        //[3] while loop

        System.out.println("this is printed using while loop ");
        int i = 0 ;
        while (i < 4){
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }
}
