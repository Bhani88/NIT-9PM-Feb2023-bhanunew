package JavaConcepts;
public class inheritance2 {
    void a(){
        System.out.println("Method a() from 'inheritance2'");
    }
}

class child1 extends inheritance2{
    void b(){
        System.out.println("Method b() from 'child1'");
    }
}

class child2 extends child1{
    void a(){
        System.out.println("Method a() from 'child2'");
    }
    void c(){
        super.a();
        System.out.println("Method c() from 'child2'");
    }
}

class child3 extends child2{
    void d(){
        System.out.println("Method d() from 'child3'");
    }
    void a(){
        System.out.println("Method a() from 'child3'");
    }

    public static void main(String[] args){
        child3 c3 = new child3();
        c3.d();
        c3.c();
        c3.b();
        c3.a();
    }
}


//This Program demonstrates Multi Level Inheritance.
/* A
   |
   B
   |
   C
 */