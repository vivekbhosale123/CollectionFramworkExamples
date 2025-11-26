package FailFastAndFailSafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeApplication {

    static void main(String[] args) {

        List<String> list=new CopyOnWriteArrayList<>();

        list.add("vivek");
        list.add("sachin");
        list.add("gauri");
        list.add("ganesh");

        Iterator<String> i=list.iterator();

        while (i.hasNext())
        {
             list.add("ganesha");
//            list.remove(2);
            String name=(String) i.next();

            IO.println(name);
        }
    }

}
