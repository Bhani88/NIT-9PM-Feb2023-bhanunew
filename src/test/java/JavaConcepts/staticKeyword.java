package JavaConcepts;
public class staticKeyword {
    int i = 2;
    static int si = 3;

    void a(){
        System.out.println("Hello World");
    }

    static void b(){
        System.out.println("Static Method b");
    }


    static{
        System.out.println("Static Block 1");
    }

    static {
        System.out.println("Static Block 2");
    }

    public static void main(String[] args){
        staticKeyword sk = new staticKeyword();
        System.out.println(sk.i);
        System.out.println(staticKeyword.si);
        sk.a();
        b(); //Calling a static method within the same class
        otherClass oc = new otherClass();
        System.out.println(oc.x);
        System.out.println(otherClass.s); //calling a static variable which is present outside the class
        oc.c();
        otherClass.d(); //Calling a static method from another class;
    }
}


class otherClass{
    int x = 5;
    static int s = 2;

    void c(){
        System.out.println("Hi There!");
    }

    static void d(){
        System.out.println("Static Method d");
    }
}