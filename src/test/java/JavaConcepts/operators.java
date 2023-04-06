package JavaConcepts;
import JavaConcepts.methods;

public class operators {
    public static void main(String[] args){
        methods m = new methods();
        m.a();
        int a=5,b=6,c=7,d=8;
        float g = 2.0f;
        System.out.println("Addition: "+(a+b+c+d));
        System.out.println("Subtraction: "+(a-b-c-d));
        System.out.println("Multiply: "+(a*b*c*d)); //Asterisk
        System.out.println("Division: "+(d/b));
        System.out.println(d/g);
        System.out.println("Modulus: "+(d%a)); //Gives the remainder

        //a = a+1 or a+=1 or a++
        //a = a+2 or a+=2

        //a = a-1 or a-=1 or a--
        //a = a-2 or a-=2

        //a = a*5 or a*=5
        //a = a/2 or a/=2

//        System.out.println("Pre Increment: "+a++); //Post Increment - 2 Step process
//        System.out.println(a);
//        System.out.println(++a); //Pre Increment
//        System.out.println(++a+b+c+d);
        System.out.println(a+++b+c+d); //This is equal to a+b+c+d
        //Relational Operators: ==, ! , >, < , <=, >=,!=
        //Logical Operators: && , ||
        // '=' is called as 'Assignment Operator'
        //'==' is called as 'Equality Operator'

        System.out.println(a==b);
    }
}
