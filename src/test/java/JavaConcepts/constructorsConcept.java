package JavaConcepts;
public class constructorsConcept {

    //A Constructor is similar to a method. It's name is same as the class name where it is declared.

    //It is executed just when the Object of the class is created.

    //If the Object is not created then constructor is not executed.

    //Constructors do not have a return type.

    constructorsConcept(){
        System.out.println("A Sample Constructor");
    }

    void constructorsConcept(){ //Method
        System.out.println("Sample Method");
    }

    public static void main(String[] args){
        constructorsConcept cc = new constructorsConcept();
    }

}

//finalize() method is used to perform cleanup activity before destroying any object
//It is called by the Garbage Collector.
