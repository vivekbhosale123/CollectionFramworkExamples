package FailFastAndFailSafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastApplication {

    static void main(String[] args) {

        List<String> list=new ArrayList<>();

        list.add("vivek");
        list.add("sachin");
        list.add("gauri");
        list.add("ganesh");

        Iterator<String> i=list.iterator();

        while (i.hasNext())
        {
            list.add("ganesha");
            String name=(String) i.next();

            IO.println(name);
        }

    }

}
