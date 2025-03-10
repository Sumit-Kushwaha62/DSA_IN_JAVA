import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
// laphavaticaly sorted:


        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Benguluru");
        ts.add("Kolkata");

        System.out.println(ts);


        Iterator<String> it = set.iterator();  
        while (it.hasNext()) {  
            System.out.println(it.next());  
        }  



        for (String element : set) {  
            System.out.println(element);  
        }  


        set.forEach(System.out::println);  



        set.stream().filter(e -> e.startsWith("A")).forEach(System.out::println);  



Set<String> syncSet = Collections.synchronizedSet(new HashSet<>());  











    }
}
