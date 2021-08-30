/**
 * Compares input temp with hottest and coldest temps on record for San Jose, CA.
 * @author Mr. King
 * @version 8/30/2021
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = Integer.parseInt(in.nextLine());
        System.out.print("What is your full name? ");
        String name = in.nextLine();
        System.out.println("Hello, " + name + ". It is very nice to meet you.");
        System.out.print("What is the current temp in San Jose? ");
        int temp = in.nextInt();
        int diffHot = 108 - temp;
        int diffCold = temp - 18;
        System.out.println("It is " + diffHot + " degrees colder than the hottest day ever and " + diffCold + " degrees warmer than the coldest day ever.");
    }
}

