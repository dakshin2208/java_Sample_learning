package conditionalprac;

import java.util.Scanner;

public class icecreampal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("1.stawberry");
        System.out.println("2.chocolate");
        System.out.println("3.vennila");
        System.out.println("4.blueberry");
        System.out.println("enter the option :");
        int option = in.nextInt();

        switch (option) {
            case 1 -> {
                System.out.println("you choosed stawberry");
                System.out.println("price:150");
            }
            case 2 -> {
                System.out.println("you choosed chocolate");
                System.out.println("price :120");
            }
            case 3 -> {
                System.out.println("you choosed venila");
                System.out.println("price :100");
            }
            case 4 -> {
                System.out.println("you choose blueberry");
                System.out.println("pricw : 203");
            }
            default -> System.out.println("invalid choice");
        }
    }
}