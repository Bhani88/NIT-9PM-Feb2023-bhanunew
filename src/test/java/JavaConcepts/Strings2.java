package JavaConcepts;
public class Strings2 {
    public static void main(String[] args){
        StringBuffer sbf = new StringBuffer("Naresh Training Institute");
        StringBuilder sbl = new StringBuilder("Naresh IT");

        //Both StringBuilder & StringBuffer are mutable.
//        System.out.println(sbf.reverse());
        System.out.println(sbf.replace(1,5,"aaaaaa"));
        System.out.println(sbf.append(" 9PMFeb2023"));
        System.out.println(sbf.delete(1,5));
        System.out.println(sbf.deleteCharAt(1));
        System.out.println(sbf.insert(2,"res"));
        System.out.println(sbf.indexOf("i"));
        System.out.println(sbf.lastIndexOf("i"));
        System.out.println(sbf.length());
    }
}
