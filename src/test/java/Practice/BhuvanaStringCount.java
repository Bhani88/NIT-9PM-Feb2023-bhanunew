package Practice;

import java.util.*;

public class BhuvanaStringCount {

    String[] cities = {"Hyderabad", "Pune", "Mumbai", "Bengaluru", "Bangalore", "Hyderabad", "Mumbai", "Bengaluru", "Pune", "Kolkata", "Calcutta"};

    public static void main(String[] args) {
        BhuvanaStringCount obj1 = new BhuvanaStringCount();
        int arrlength = obj1.cities.length;
        System.out.println(arrlength);

        List asList = Arrays.asList(obj1.cities);
        Set<String> mySet = new HashSet<String>(asList);

        for (String s : mySet) {
            System.out.println(s + " " + Collections.frequency(asList, s));

        /*int hydCounter = 1;
        for(int i=0;i<arrlength;i++){
            for(int j=1;j<arrlength-1;j++){

            *//*System.out.println(obj1.cities[i]);
            System.out.println("-----------------------");*//*
                if(obj1.cities[i].equals(obj1.cities[j])){
                    hydCounter++;
                }else{
                    continue;
                }
            }
        }
        System.out.println("Hyderabd:: "+hydCounter);*/
        }

    }
}
