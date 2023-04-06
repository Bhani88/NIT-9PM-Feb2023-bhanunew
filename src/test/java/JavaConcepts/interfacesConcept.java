package JavaConcepts;

interface in{
    int i = 5; //All the variables declared inside an interface are 'public static final'.
    void a(); //All the methods declared inside an interface are 'public abstract' only.
//    void b();
}

interface in1{
    void a();
}

public class interfacesConcept implements in,in1 {
    public void a(){
        System.out.println("Overridden interface method a");
//        in.i = 6;
    }

    public static void main(String[] args){
        interfacesConcept ic = new interfacesConcept();
//        ic.a();
//        in i = new in(); //Interfaces cannot be instantiated (cant create an object)
        in ic1 = new interfacesConcept();
        ic1.a();
    }
}


//We can extend only once but implement multiple times. Interfaces solve the problem of Multiple Inheritance in Java.
//Class extends another Class
//Interface also extends another Interface
//But Class can only implement an interface.