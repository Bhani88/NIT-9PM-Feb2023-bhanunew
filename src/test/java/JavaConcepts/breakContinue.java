package JavaConcepts;
public class breakContinue {
    public static void main(String[] args){
        for(int i = 1; i<6;i++){
            System.out.println(i);
            if(i==3){
                System.out.println("break is executed");
                break; //'break' keyword exits the loop here
//                System.out.println("break is executed");
                //break keyword should be the last statement in the block. Anything in the block after break keyword are not reachable.
            }
        }
        System.out.println("Outside of my first for loop");

        for(int j=1;j<6;j++){

            if(j==3) {
                continue;
            }//skips the iteration.
            System.out.println(j);
        }
        System.out.println("After Continue");
    }
}
