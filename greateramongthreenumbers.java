package conditionalprac;

import java.util.Scanner;

public class greateramongthreenumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
       int b= in.nextInt();
       int c = in.nextInt();
//        String result = a>=0?"a is psitive":"a is negative ";
//        System.out.println(result);
        int max = a;
        if (b>max)
        {
            max = b;
        }
         if (c>max)
        {
             max = c;
        }


        System.out.println("the greatest number :"+max);


    }
}
