package JavaConcepts;
public class thisKeyword {
    int x = 5;

    thisKeyword(){
        System.out.println("Constructor");
    }

    thisKeyword(int i){
        this(); //Refers to the current class constructor with no parameter.
        System.out.println("Parameterized Constructor: "+i);
    }

    void a(int x){
        System.out.println(x);
        System.out.println(this.x); //this keyword is used to refer to the current class instance variable
        //We will use it to refer to instance variable sometimes to avoid confusion when local & instance variable names are same.
    }

    void b(int y){
        System.out.println(y);
        System.out.println(x);
    }

    public static void main(String[] args){
        thisKeyword tk = new thisKeyword(5);
        tk.a(3);
        System.out.println("------");
        tk.b(6);
    }
}
