package Practice;

public class PrasanthiStringcount {
    public static void main(String[] args) {
        String s = "Hyderabad, Pune, Mumbai, Bengaluru, Bangalore, Hyderabad, Mumbai, Bengaluru, Pune, Kolkata, Calcutta";
        String[] sa = s.split(", ");
        int count;
        for(int i=0; i<sa.length;i++){
            count =1;
            for  (int j =i+1; j <sa.length;j++) {
                if (sa[i].equals(sa[j])) {
                    count = count + 1;
                    sa[j] = "0";
                }
            }
                if (!sa[i].equals("0"))
                {
                    System.out.println(sa[i]+"   " + count);


                }
            }

        }

    }


