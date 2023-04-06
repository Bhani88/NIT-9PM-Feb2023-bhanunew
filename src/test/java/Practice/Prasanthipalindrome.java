package Practice;

public class Prasanthipalindrome {

    String b = "Madam";
    String reverse = "";

    void palindromecheck2() {
        for (int x = b.length() - 1; x >= 0; x--) {
            reverse = reverse + b.charAt(x);
        }
        System.out.println(reverse);
        if (b.equalsIgnoreCase(reverse)){
              //  b.toLowerCase().reverse.toLowerCase()) {
            System.out.println("b is a palindrome");
        } else {
            System.out.println("b is not a palindrome");

        }
    }

    void palindormecheck (String s){
        StringBuffer sbf = new StringBuffer(s);
         System.out.println(sbf.reverse());

        if(s.equals(sbf.reverse())) {
            System.out.println("String is a palindrome");
        }
            else {
                System.out.println("String is not a palindrome");
            }

        }



        public static void main(String[] args) {
            Prasanthipalindrome pd = new Prasanthipalindrome();
            pd.palindormecheck("JAVA");
            pd.palindromecheck2();

        }
    }

