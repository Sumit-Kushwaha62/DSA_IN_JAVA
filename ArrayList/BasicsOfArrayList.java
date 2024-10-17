package ArrayList;

import java.util.ArrayList;

public class BasicsOfArrayList {



    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Operations on arraylist:

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        list.get(2); // gives the value of index 2
        list.remove(2);
        System.out.println(list);

        list.set(1, 3);
        System.out.println(list);

        System.out.println(list.contains(1));
        System.out.println(list.size());

        // Traversing on arraylist:

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        // Reverse of an arraylist:

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }


System.out.println();


// Maximum in array list:
int max = Integer.MIN_VALUE;
for(int i = 0; i<list.size(); i++){


    max = Math.max(max, list.get(1));
}

System.out.println("Max Element = " + max);






    }
}
