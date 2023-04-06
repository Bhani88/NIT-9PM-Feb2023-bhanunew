package JavaConcepts;
public class Strings {
    public static void main(String[] args){
        String s = "Naresh Training Institute";
        System.out.println(s.hashCode());
        String ss = new String("NIT9PMFeb2023");

        //Strings are immutable. Cannot be updated/changed.
//        s = "NIT"; //Updating
//        System.out.println(s.hashCode());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.contains("tute"));
        System.out.println(s.contains("naresh"));
        System.out.println(s.equals("naresh Training Institute"));
        System.out.println(s.equalsIgnoreCase("naresh Training Institute"));
        System.out.println(s.length());
        System.out.println(s.startsWith("Na"));
        System.out.println(s.endsWith("tut"));
        System.out.println(s.indexOf("i"));
        System.out.println(s.lastIndexOf("i"));
        System.out.println(s.concat(" 9PM Feb"));
        System.out.println(s.replace("N","n"));
        System.out.println(s.charAt(1));
        System.out.println(s.substring(7));
        System.out.println(s.substring(7,15));
        String i = "5000";
        int x = Integer.parseInt(i);
        float f = Float.parseFloat(i);
        System.out.println(x-500);
        System.out.println(String.valueOf(x)+"0");
        char[] ch = s.toCharArray();
        for(char c : ch){
            System.out.println(c);
        }
        String[] sa = s.split(" ");
        for(String y : sa){
            System.out.println(y);
        }
    }
}
