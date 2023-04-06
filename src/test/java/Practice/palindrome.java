package Practice;

public class palindrome {
    public static void main(String[] args)
    {
        String s="madam";
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        String str=sb.toString();
        if(s.equals(str)) {
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");

        }
        }


}