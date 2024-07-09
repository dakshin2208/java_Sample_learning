package conditionalprac;

import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int days=in.nextInt();
        switch (days) {
//            case 1 -> System.out.println("sunday");
//            case 2 -> System.out.println(" monday");
//            case 3 -> System.out.println("tuesday");
//            case 4 -> System.out.println("wednesday");
//            case 5 -> System.out.println("thursday");
//            case 6 -> System.out.println("friday");
//            case 7 -> System.out.println("saturday");
            case 1, 2, 3, 4, 5 -> System.out.println("weekdays");
            case 6, 7 -> System.out.println("weekends");
        }
    }
}
