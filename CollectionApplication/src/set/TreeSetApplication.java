package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetApplication {

    static void main(String[] args) {

        Set<String> set=new TreeSet<>();

        set.add("vivek");
        set.add("ravi");
        set.add("ganesh");
//        set.add(null);

        set.stream().forEach(System.out::println);
    }

}
