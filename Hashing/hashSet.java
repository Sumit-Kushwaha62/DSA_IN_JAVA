
import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();


set.add(1);
set.add(2);
set.add(3);
set.add(4);

// System.out.println(set);

// set.remove(2);
// if(set.contains(2)){
//     System.out.println("set contains 2");
// }if(set.contains(3)){
//     System.out.println("set contains 3");
// }

// System.out.println(set.size());


// System.out.println(set.isEmpty());
// set.clear();


//<<<<<<<<<< Iterate on HashSet, Using Iterators:

// Iterator it = set.iterator();
// while (it.hasNext()) {
//     System.out.println(it.next());
// }

// <<<<<<<<<< Iterate using Enhanced for loop: 


for (Integer i : set) {
    System.out.print(i+", ");
}












    }
}
