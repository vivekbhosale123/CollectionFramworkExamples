package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HasSetApplication {

    static void main(String[] args) {
        Set<String> set=new HashSet<>();

        set.add("vivek");
        set.add("ravi");
//        set.add(null);
        set.add("ganesh");
        set.add(null);

        set.stream().forEach(System.out::println);

    }

}
