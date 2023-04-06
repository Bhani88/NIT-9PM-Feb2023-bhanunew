package JavaConcepts;

public class exceptionHandling2 {
    void a(){
        System.out.println("Demonstrates the 'throw' keyword");
        throw new ArithmeticException("This is my Exception");
    }

    public static void main(String[] args) throws InterruptedException{
        exceptionHandling2 e2 = new exceptionHandling2();
       try{
           e2.a();
       }
        catch(Exception e){
            System.out.println(e);
        }

//       try {
           Thread.sleep(5000); //This will temporarily hold on with the execution of the program for 5 Seconds.
//       }
//       catch(Exception e){
//
//       }
        System.out.println("Hello World");
    }
}
