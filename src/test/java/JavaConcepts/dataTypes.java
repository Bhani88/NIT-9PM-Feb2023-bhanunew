package JavaConcepts;
public class dataTypes {
    public static void main(String[] args){
      //There are 2 types of data types in Java: Primitive & Non-Primitive

        //Non-Primitive Data Types: Class, Interface, Strings & Arrays.
        //Primitive Data Types: Integers, Decimals, Characters & Boolean.
        //Integers: byte, short, int & long
        //byte : 2 power 8 values - 256 values or size. Range - -128 to -1 & 0 to 127.
        //short : 2 power 16 values - 65536 values or size. Range - -32768 to -1 & 0 to 32767.
        //int : 2 power 32 values.
        //long : 2 power 64 values.

        //Decimals: float & double.
        //float : Size is 2 power 32.
        //double : Size is 2 power 64.

        //Characters: char size is 2 power 16. (65536 values)
        //boolean : it is either true or false.
        byte x = 2; //dataType variableName (or identifier)= value;
        short a = 130;
        int i = 5;
        long b = 6;
        float y = 1.56f ; //include 'f' in the value for float variables
        double d = 0.34563456;
        char ch = 'a';
        char c = 99;
        boolean bl = true;
        boolean bl2 = false;
        System.out.println(5);
        System.out.print(2+6);
        System.out.println("5"+"5");
        System.out.println(x);
        System.out.println("x");
        System.out.println('x'+'x');
        System.out.println('x'+"y");
        System.out.println(5+'x');
        System.out.println("NIT\nTraining"); // \n - used for a new line
        System.out.println("NIT\tHyderabad");  // \t - used for a new tab
        //(targetDataType) targetVariable;
        byte cc = (byte) a;
        System.out.println(cc);
    }
}
