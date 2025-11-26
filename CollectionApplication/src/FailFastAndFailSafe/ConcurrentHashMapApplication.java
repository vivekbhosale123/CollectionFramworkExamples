package FailFastAndFailSafe;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapApplication {

    static void main(String[] args) {

        Map<String,String> map=new ConcurrentHashMap<>();

        map.put("vivek","sachin");
        map.put("gan","abc");
        map.put("ramehs","rama");
        map.put("kama","gyama");

        map.forEach((k,v)->{
            map.remove(k);
            IO.println(k+" "+v);
        });
    }

}
