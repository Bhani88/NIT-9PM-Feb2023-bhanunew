package JavaConcepts;

import java.util.ArrayList;
import java.util.List;

public class collections1 {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<Integer>();
        List<Integer> li = new ArrayList<Integer>();
        al.add(9);
        al.add(6);
        al.add(7);
        al.add(1);
        al.add(6);
        System.out.println(al);
        System.out.println(al.isEmpty());
        System.out.println(al.indexOf(6));
        System.out.println(al.lastIndexOf(6));
        System.out.println(al.size());
        System.out.println(al.contains(4));
        System.out.println(al.get(2));
        System.out.println(al.remove(2));
        System.out.println(al);
    }
}
