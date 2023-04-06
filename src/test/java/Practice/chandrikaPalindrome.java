package Practice;

public class chandrikaPalindrome {
    String name = "Poorna";
    String Reversename = "";

    public void NameinReverse() {
        for (int x = name.length() - 1; x >= 0; x--) {
            Reversename = Reversename + name.charAt(x);
        }
        if (name.toLowerCase().equals(Reversename.toLowerCase())) {
            System.out.println("The String is a Palindrome: " + name);
        } else {
            System.out.println("The String is not a Palindrome: " + name);
        }

    }
    public static void main(String[] args) {
        chandrikaPalindrome ch = new chandrikaPalindrome();
        ch.NameinReverse();
    }
}

