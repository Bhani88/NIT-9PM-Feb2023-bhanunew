package JavaConcepts;
public class ifCondition {
    public static void main(String[] args){
        int a = 2, b=5;

        if(a>b){ //Block
            System.out.println("a is greater than b");
        }
        if(a<b){
            System.out.println("a is less than b");
        }
        if(a==b){
            System.out.println("a is equal to b");
        }

        else if(a>=b){
            System.out.println("a is equal to b");
        }

        else if(b>a){
            System.out.println("b is greater than a");
        }

        else{
           System.out.println("Else Condition");
        }
    }
}
