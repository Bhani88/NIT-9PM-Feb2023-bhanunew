package JavaConcepts;
import java.util.Scanner;

public class scannerConcept {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your data: ");
//        String name = sc.next(); //Takes the input string till the first whitespace only or only the first word.
//        String name = sc.nextLine();
//        System.out.println(name);
        int number = sc.nextInt();
        System.out.println(number*10);
    }
}
