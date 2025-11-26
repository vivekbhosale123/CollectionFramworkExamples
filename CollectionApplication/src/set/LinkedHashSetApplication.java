package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetApplication {

    static void main(String[] args) {

        Set<String> hashset=new LinkedHashSet<String>();

        hashset.add("swara");
        hashset.add("pura");
        hashset.add(null);
        hashset.add("puras");
        hashset.add(null);

        hashset.stream().forEach(System.out::println);

    }

}
