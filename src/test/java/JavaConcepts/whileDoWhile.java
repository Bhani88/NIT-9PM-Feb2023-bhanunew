package JavaConcepts;
public class whileDoWhile {
    public static void main(String[] args){
        int i = 0, j=6,h=0;

        while(i<5){
            System.out.println(i);
            i++;
        }

        System.out.println("--------");

        while(j>0){
            System.out.println(j);
            j--;
        }

        System.out.println("--------");

        do{
            System.out.println(h);
            h++;
        }while(i<0);
 //do while loop will execute at least for 1 time even if the loop conditions are incorrect unlike the other loops.
    }
}
