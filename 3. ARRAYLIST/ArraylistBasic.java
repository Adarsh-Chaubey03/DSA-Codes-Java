import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraylistBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // wrapper class
//    Integer i = new Integer(3);
//    new way
        Integer in = Integer.valueOf(4); //object
//        int in = 4;  // just a variable
        System.out.println(in);

        //************* declaring an arraylist *********

//        List<AnyClass> list = new Arraylist<AnyClass>();
        ArrayList<Integer> l1 = new ArrayList<Integer>(); // SECOND TIME INTEGER IS OPTIONAL


       // ****** ADD NEW ELEMENT *******
       l1.add(5);
       l1.add(6);
       l1.add(7);
       l1.add(8);
       // in the same order


        // GET ELEMENT AT INDEX i
        System.out.println(l1.get(2));

        // Printing Using For Loop
        for ( int i = 0; i< l1.size(); i++){
            System.out.println(l1.get(i));
        }
/*

        5
        6
        7
        8
        */
        // Print this ArrayList Directly

        System.out.println(l1); // [5, 6, 7, 8]

        // Add element at index i

        l1.add(1,102);
        System.out.println(l1); // [5, 102, 6, 7, 8]

        // Modify Element at index i

    l1.set(0,101);
        System.out.println(l1);   // [101, 102, 6, 7, 8]

    // Remove Element At index i

        l1.remove(2);
        System.out.println(l1); // [101, 102, 7, 8]

  // Remove an element e


        System.out.println( l1.remove(Integer.valueOf(7))); //true
        l1.remove(Integer.valueOf(7));

        System.out.println(l1);//  [101, 102, 8]

// Checking If An Element exists or not

        boolean ans = l1.contains(Integer.valueOf(90)); // false
        System.out.println(ans);

// if pdt is not specified any dt can be kept in arraylist unlike array

ArrayList l = new ArrayList();
l.add('p');
l.add(1);
        System.out.println(l);  //  [p, 1]
    }

}
