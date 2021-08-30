import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many siblings do you have? ");
        int sib = Integer.parseInt(in.nextLine());
        System.out.print("What is your name?");
        String name = in.nextLine();
        System.out.println("That's cool.");
   }
}
