package JavaConcepts;

public class arrays {
    public static void main(String[] args){
        //Arrays are data structures which store values of similar data types
        int[] a;
        a = new int[5];

        int[] b = new int[4];

        //Indexes in an array always start from 0 (zero).
        //Indexes cannot be negative.
        //Highest Index is calculated as Array Size - 1.
        int[] c = {9,8,7,6,1};
        System.out.println(c.length);
//        System.out.println(c[5]);
        int[][] d = new int[2][2];
        d[0][0] = 9;
        d[0][1] = 8;
        d[1][0] = 7;
        d[1][1] = 6;
//        System.out.println(c[2]);
//        System.out.println(c[1]);
//        System.out.println(c[4]);
//        System.out.println(c[0]);
//        System.out.println(c[3]);
        for(int x =0 ;x<c.length;x++){
            System.out.println(c[x]);
        }

        for(int x = 0;x<d.length;x++){
            for(int y=0;y<d.length;y++){
                System.out.print(d[x][y] +"\t");
            }
        }

    }
}
