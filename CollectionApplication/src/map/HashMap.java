package map;

import java.util.Map;

public class HashMap {

    static void main(String[] args) {

        Map<String,String> map=new java.util.HashMap<>();

        map.put("vivek","abe");
        map.put("sachi",null);
        map.put(null,"abe");
        map.put("vivek","abe");
        map.put("ganesh",null);

        map.forEach((k,v)->{
            IO.println(k+" "+v);
        });

    }

}
