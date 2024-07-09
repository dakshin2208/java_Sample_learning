package conditionalprac;

import java.util.Scanner;

public class problemsw3school {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt();//10
        int b=in.nextInt();//20
        int c=in.nextInt();//30
        int max=a;//10
        if(b>max)//10>20-->false
        {
            max = b;

            if (c>max)//20>30
            {
                max = c;
            }
        }
        System.out.println(max);
    }


}
