package JavaConcepts;
public class returnTypes {

    int a(){
        System.out.println("Method with int return type");
        return 5; //return keyword should be used for all the methods other than void return type
//        System.out.println("Hello World");
        //no code should be written in the method after the return keyword. Anything written after the return keyword in the method are unreachable.
    }

    int b(int i){
        System.out.println("Method with int return type & int parameter");
        return i;
    }

    float c(float x, int y){
        System.out.println("Method with int return type & float, int parameters");
        return x+y;
    }

    public static void main(String[] args){
        returnTypes rt = new returnTypes();
//        rt.a();
        int x = rt.a();
        System.out.println(x);
        rt.b(3);
        rt.c(2.5f,2);
//        float f = rt.c(2.5f,2);
    }
}
