import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.println("What is your favorite color?");
        String color = scanner.nextLine();
    }
}
