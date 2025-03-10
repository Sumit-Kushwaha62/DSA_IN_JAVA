import java.util.LinkedHashSet;

public class linkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> hs = new LinkedHashSet<>();

        hs.add("Delhi");
        hs.add("Mumbai");
        hs.add("Noida");
        hs.add("Benguluru");
        hs.add("Kolkata");

        System.out.println(hs);
    }
}
