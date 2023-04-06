package JavaConcepts;

abstract class abc{
    abstract void a(); //Abstract Method
    void b(){
        System.out.println("Concrete method b from 'abc'"); //Concrete Method
    }
}

public class abstractClass extends abc{ //If we are extending a class which is declared as 'abstract' we should mandatory override its abstract methods.

//    abstract void c(); //We cannot declare an Abstract Method in a Non-Abstract (Concrete) class.

    void a(){
        System.out.println("Overridden abstract method a");
    }

    void c(){
        System.out.println("Concrete method c from 'abstractClass'");
    }

    public static void main(String[] args){
        abstractClass abc = new abstractClass();
        abc.a();
        abc.c();
        abc.b();
//        abc ob = new abc(); //We cannot instantiate (create an object) for an abstract class.
    }

}


//There are 2 types of Classes: Abstract & Concrete.
//Concrete Classes have Concrete Methods only.
//Abstract Classes are declared using the keyword 'abstract' & they can have both abstract & concrete methods.
//Abstract Methods do not have a method body & are declared using the keyword 'abstract'.
//Concrete Methods have a method body.
