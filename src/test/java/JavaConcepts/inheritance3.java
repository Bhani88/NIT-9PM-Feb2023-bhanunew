package JavaConcepts;
public class inheritance3 {
    void a(){
        System.out.println("Method a() from 'inheritance2'");
    }
}

class child4 extends inheritance3{
    void b(){
        System.out.println("Method b() from 'child4'");
    }
}

class child5 extends inheritance3{
    void c(){
        System.out.println("Method c() from 'child5'");
    }
}

class child6 extends inheritance3{
    void d(){
        System.out.println("Method d() from 'child6'");
    }
    public static void main(String[] args){
        child6 c6= new child6();
        c6.d();
        c6.a();
        child5 c5 = new child5();
        c5.c();
        c5.a();
    }
}

//This program demonstrates Hierarchical Inheritance.
/*
    A
  / | \
  B C  D

 */
