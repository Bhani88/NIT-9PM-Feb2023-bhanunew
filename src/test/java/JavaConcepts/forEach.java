package JavaConcepts;
public class forEach {
    public static void main(String[] args){
        int[] a = {5,4,9,8,0};
        float[] b = {9.1f,8.2f,7.4f,6.0f,2.1f};
        for(int x : a){
            System.out.print(x +"\t");
        }
        System.out.println("\n----------");

        for(float y : b){
            System.out.println(y);
        }
    }
}
