package JavaConcepts;
public class overloadedMethods {

    void a(){
        System.out.println("Method with no parameters");
    }

    void a(int i){
        System.out.println("Method with int parameter");
    }

    void a(float y){
        System.out.println("Method with float parameter");
    }

    void a(char b){
        System.out.println("Method with char parameter");
    }

    public static void main(String[] args){
        overloadedMethods om = new overloadedMethods();
        om.a();
        om.a(2.5f);
        om.a('c');
    }
}

//Method Overloading: 2 or more methods having the same method name but different parameters.
//Method overloading is not dependant on return type.