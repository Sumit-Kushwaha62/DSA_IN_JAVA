package ArrayList;
import java.util.*;

public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
       
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        list.add(8);

        System.out.println(list);

        Collections.sort(list); // Assending order
        System.out.println(list);


        System.out.println();
        Collections.sort(list, Collections.reverseOrder());
System.out.println(list);
    }
}
