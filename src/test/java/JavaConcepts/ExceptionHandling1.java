package JavaConcepts;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class ExceptionHandling1 {
    public static void main(String[] args){
        try{ //Contains code which will throw an exception
            System.out.println(5/0);
        }
        catch(ArrayIndexOutOfBoundsException e){ //Contains code to handle the exception
            System.out.println("Exception handled");
            e.printStackTrace();
        }
        catch(ArithmeticException e){
            System.out.println("Exception handled");
            e.printStackTrace();
        }
        catch(Exception e){
        }
        //If there are multiple 'catch' blocks, always use the Generic Exception Catch Block at the end as a backup.
        finally{  //finally block will execute no matter the exception is handled or not.
           System.out.println("Finally Block");
        }
        System.out.println("Hello World");
    }
}

//Exception is an event due to which the flow of the program is stopped during execution.

//Unchecked Exceptions (Logical Issues) : Examples: ArithmeticException, ArrayIndexOutOfBoundsException etc., Should be handled only using try/catch blocks.

//Checked Exceptions: Examples: IOException, FileNotFoundException, InterruptedException etc., Can be handled using try/catch or 'throws' keyword.