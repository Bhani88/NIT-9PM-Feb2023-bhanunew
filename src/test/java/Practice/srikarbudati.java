package Practice;
import java.util.Scanner;

class reversal{
    void a(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any string");
        String s=sc.next();
        String l=s;
        char st;
        String str="";
        for(int i=s.length()-1;i>=0;i--)
        {
            st=s.charAt(i);
            str=str+st;
        }
        System.out.println("reverse of the string is "+ str);
        if (l==str) {
            System.out.println("given string is palindrome");
        }
        else{
            System.out.println("given string is not a palindrome");
        }
    }
}

public class srikarbudati {

    public static void main(String[] args){
        reversal r=new reversal();
        r.a();
    }


}
