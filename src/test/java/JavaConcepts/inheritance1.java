package JavaConcepts;
public class inheritance1 {
    int i = 4;
    void a(){
        System.out.println("Method a() from class 'inheritance1'");
    }
}

class anotherClass extends inheritance1{ //class after the extends keyword is a Parent/Super Class.
    int j = 5;
    void b(){
        System.out.println("Method b() from class 'anotherClass'");
    }

    void a(){
        System.out.println("Overridden Method a() from class 'anotherClass'");
    }
    public static void main(String[] args){
//        inheritance1 in = new inheritance1(); //parent class object
//        System.out.println(in.i);
//        in.a();

        anotherClass ac = new anotherClass(); //child class object
        System.out.println(ac.j);
        ac.b();
        System.out.println(ac.i);
        ac.a();
    }
}

//Method Overriding - Updating the method inherited from the Parent class in the child class.
//Overriding requires inheritance.
//static methods cannot be overridden.