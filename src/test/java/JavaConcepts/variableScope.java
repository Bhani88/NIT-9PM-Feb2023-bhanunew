package JavaConcepts;
public class variableScope {
   int i = 5; //instance variable
     static int k = 3; //static variable

    public static void main(String[] args){
        int j = 2; //Local Variable. Local to main method.
        System.out.println(j);
        //className objectName = new className(); //Object Name or Reference Variable
        variableScope vs = new variableScope();
        variableScope vs1 = new variableScope();
        //To access instance variable or any method, we will use objectName.instanceVariableName or objectName.methodName
        System.out.println(vs.i);
        System.out.println(k);
        System.out.println(vs.hashCode());
        System.out.println(vs1.hashCode());
        if(true){
             j = 4; //Updating the value
            int l = 7; //Local Variable. Local to 'if' condition.
            System.out.println(l);
        }
        System.out.println("Value of variable j is: "+j);
//        System.out.println(l);
    }
}



//Instance Variable: Declared inside a class but not inside any method (not even main method). Can be accessed only with an Object.

//Local Variable: Declared inside a class and inside either a method (even main method) or block or loop. No need of an object to access it.

//Static Variable: Declared just like an instance variable but along with the keyword 'static'. Can be accessed without an object. Cannot be declared inside any method/block or loop.