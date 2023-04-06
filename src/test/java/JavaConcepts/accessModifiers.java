package JavaConcepts;

public class accessModifiers {
    int i = 5; //Access Modifier is 'default' for this variable
    private int pi = 6;

    private void a(){
        System.out.println("This is a Private Method");
    }
}

class efghi{

    private int p = 7;

    public static void main(String[] args){
        accessModifiers am = new accessModifiers();
        System.out.println(am.i);
//        System.out.println(am.pi); //Private Variable
//        am.a(); //Private method
        efghi ef = new efghi();
        System.out.println(ef.p);
    }
}



//Java has 4 types of Access Modifiers 'private', 'default', 'protected' & 'public'. They can be used for Methods, Variables & Constructors.
//Access Modifier name |	within class   |   within package | outside package but subclass only | outside package
//    private	                    Y	              N	                      N	                           N
//    default	                    Y	              Y	                      N	                           N
//    protected	                    Y	              Y	                      Y	                           N
//    public	                    Y	              Y	                      Y	                           Y
