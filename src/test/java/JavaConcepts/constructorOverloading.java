package JavaConcepts;
public class constructorOverloading {

    constructorOverloading(){
        System.out.println("Constructor with no parameter");
    }

    constructorOverloading(int i){
        System.out.println("Constructor with int parameter");
    }

    constructorOverloading(float f){
        System.out.println("Constructor with float parameter");
    }

    public static void main(String[] args){
        constructorOverloading co = new constructorOverloading();
        constructorOverloading co1 = new constructorOverloading(2.5f);
        constructorOverloading co2 = new constructorOverloading(1);
    }
}
