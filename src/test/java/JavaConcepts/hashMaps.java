package JavaConcepts;

import java.util.HashMap;
import java.util.Map;

public class hashMaps {
    public static void main(String[] args){
        //Map is an interface
        //HashMap is a Class
        Map<String, Integer> m = new HashMap<String,Integer>();
        HashMap<Integer, String> hm = new HashMap();
        hm.put(1,"NIT");
        hm.put(2,"Feb2023");
        hm.put(3,"9PM");
        hm.put(4,"NIT");
        hm.put(4,"nit");
        hm.put(5,"nit");
        System.out.println(hm);
        System.out.println(hm.isEmpty());
        System.out.println(hm.size());
        System.out.println(hm.containsKey(6));
        System.out.println(hm.containsValue("Nit"));
        hm.replace(5,"NIT9PM");
        hm.remove(5);
        System.out.println(hm);
        System.out.println(hm.get(1));
        for(Map.Entry h: hm.entrySet()){
            System.out.print(h.getKey()+" : "+h.getValue()+" ");
        }
    }
}
