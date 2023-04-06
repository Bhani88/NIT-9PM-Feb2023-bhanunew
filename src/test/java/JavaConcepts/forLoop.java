package JavaConcepts;
public class forLoop {
    public static void main(String[] args){
        for(int i =1;i<=5;i++){
            System.out.println(i);
        }

        System.out.println("------");

        for(int i=5;i>0;i--){
            System.out.println(i);
        }

        System.out.println("------");

        for(int a = 0;a<5;a++){
            for(int b = 0; b<5;b++){
                System.out.println(a);
                System.out.print(b+"\t");
            }
        }
    }
}
