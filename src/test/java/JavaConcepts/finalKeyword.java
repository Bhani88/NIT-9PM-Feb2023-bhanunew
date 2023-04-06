package JavaConcepts;
final class efgh{
   int x = 6;
}

class abcd{
    void a(){
        System.out.println("Method a() from 'abcd'");
    }

    final void b(){
        System.out.println("Final Method b() from 'abcd'");
    }
}


public class finalKeyword extends abcd{
    int i = 6;
    final int fi = 5;

    void a(){
        System.out.println("Method a() from 'finalKeyword'");
    }

//    void b(){ //Parent class method is final & we cannot override
//
//    }
    public static void main(String[] args){
        finalKeyword fk = new finalKeyword();
        fk.i= 7;
//        fk.fi = 4; //Variable is final & we cannot update its value
        System.out.println(fk.i);
        fk.a();
    }
}


//If a variable is declared as 'final' we cannot update its value.
//If a method is declared as 'final' we cannot override that method.
//If a class is declared as 'final' we cannot inherit/extend that class.