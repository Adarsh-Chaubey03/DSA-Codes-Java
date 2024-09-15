import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseAnArrayList {
    static void reverseList(ArrayList<Integer> list){
        int i = 0 , j= list.size()-1;
        while (i<j){
            // swapping
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }

    }    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(8);
        list.add(9);
        System.out.println("original list " + list);  // original list [0, 10, 8, 9]

       // reverseList(list);
        Collections.reverse(list);  // no need to write any method while using this class
        System.out.println("reversed list " + list);  // reversed list[9, 8, 10, 0]

       // ascending order
        Collections.sort(list);
        System.out.println("ascending list "+ list); //ascending list [0, 8, 9, 10]

       // descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Descending order "+ list);

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("zi");
        l1.add("there");
        System.out.println("original list " + l1); //original list [zi, there]
        Collections.sort(l1);
        System.out.println("ascending order " + l1); //ascending order [there, zi]
    }
}
