package JavaConcepts;

import java.util.HashSet;
import java.util.Set;

public class collections2 {
    public static void main(String[] args){
        Set<Integer> hs = new HashSet<Integer>();
//        HashSet<Integer> hss = new HashSet<Integer>();
//        hss.add(5);
//        hss.add(6);
//        hss.add(1);
//        hss.add(3);
//        hss.add(0);
//        System.out.println(hss);
        HashSet<String> hss = new HashSet<String>();
        hss.add("NIT");
        hss.add("Feb");
        hss.add("2023");
        hss.add("9PM");
        hss.add("NIT"); //Stores only unique elements
        hss.add(null); //Accepts null values
        hss.add(null);
        System.out.println(hss);
        System.out.println(hss.size());
        System.out.println(hss.isEmpty());
        System.out.println(hss.contains("nit"));
        System.out.println(hss.remove(null));
        System.out.println(hss);
    }
}
