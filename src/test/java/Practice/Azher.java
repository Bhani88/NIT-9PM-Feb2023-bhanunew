package Practice;

import java.io.StringReader;

public class Azher{
    void Palindrome(String S) {
        StringBuffer Sbf = new StringBuffer(S);
        Sbf.reverse();
        String rev = Sbf.toString();
        System.out.println(rev);

        if (S.equals(rev)) {
            System.out.println("Given string is Palindrome");
        }
        else {
            System.out.println("Given string is not a Palindrome");
        }
    }

    public static void main(String[] args){
 Azher S1=new Azher();
 S1.Palindrome("MADAM");
 S1.Palindrome("NARESH");

    }
}
