package JavaConcepts;
public class superKeyword {
    int i = 5;

    void a(){
        System.out.println("Method a() from 'superKeyword'");
    }

    superKeyword(){
        System.out.println("Parent Class Constructor");
    }
}

class subClass extends superKeyword{

    subClass(){
        System.out.println("Child Class Constructor");
    }

    void a(){
        System.out.println("Overridden method a() from 'subClass'");
    }

    void b(){
        super.a();
    }

    public static void main(String[] args) {
        subClass sc = new subClass();
        sc.a();
        sc.b();
    }
}

//'super' keyword is used to refer to the Parent Class Variables & Parent Class Methods when the variable or method names of both Parent and Child Class are same.
//Methods of a Parent Class can be overridden and then we should use super.methodName() to refer to the Parent Class Method.
//The Parent Class Constructor is automatically called when an object is created to for Child Class due to Inheritance or we can also use super() to refer to Parent Class Constructor.