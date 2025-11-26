package map;

import java.util.Map;

public class TreeMap {

    static void main(String[] args) {
        Map<String,String> map=new java.util.TreeMap<>();

        map.put("vivek","abe");
        map.put("sachi",null);
        map.put("vives","abe");
        map.put("vivesk","abe");
        map.put("ganesh",null);

        map.forEach((k,v)->{
            IO.println(k+" "+v);
        });
    }

}
