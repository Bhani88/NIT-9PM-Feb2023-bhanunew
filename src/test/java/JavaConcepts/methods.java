package JavaConcepts;

public class methods {

    public void a(){ //Parameters or Arguments
        System.out.println("Hello World");
    }
//for void methods, the output can be displayed but the output cannot be stored in any variable.
    void b(int i){ //method with 1 parameter (int)
        System.out.println(i);
    }

    void c(int x, float y){ //2 parameters (int, float)
        System.out.println(x+y);
    }

    void d(int x, float y,char z){
        System.out.println(x+y+z);
    }


    public static void main(String[] args){
        methods m = new methods();
//        int x = m.b(2);
        m.a(); //Calling the method inside the main method
        m.b(5);
        m.b(4);
        m.c(1,1.5f);
        m.d(5,2.5f,'a');
    }
}
