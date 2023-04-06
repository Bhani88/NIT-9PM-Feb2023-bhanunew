package JavaConcepts;

import java.util.TreeSet;

public class collections3 {
    public static void main(String[] args){
//        TreeSet<String> ts = new TreeSet<String>();
//        ts.add("NIT");
//        ts.add("Feb");
//        ts.add("2023");
//        ts.add("9PM");
//        ts.add("NIT"); //Stores only unique elements
//        ts.add(null); //Does not accept null values. Throws "NullPointerException"
//        ts.add(null);
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(5);
        ts.add(6);
        ts.add(1);
        ts.add(3);
        ts.add(0);
        System.out.println(ts);
        System.out.println(ts.size());
        System.out.println(ts.isEmpty());
        System.out.println(ts.contains(7));
        System.out.println(ts.remove(0));
        System.out.println(ts);
//        System.out.println(ts.descendingSet());
        for(Integer i : ts){
            System.out.println(i);
        }
    }
}
