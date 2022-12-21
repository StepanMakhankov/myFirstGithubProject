import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.println("What is your favorite color?");
        String color = scanner.nextLine();
        System.out.println("Would you like to play a mini game?");
        String answer = scanner.nextLine();
        switch (answer){
            case "yes":
                System.out.println("I guessed a number from the 3rd number from 0 to 9. If you guess at least one, then you win.");
                System.out.println("Your answer:");
                String answer2 = scanner.nextLine();
                switch (Integer.parseInt(answer2)){
                    case 1, 6, 7:
                        System.out.println("You won!");
                        break;
                    default:
                        System.out.println("You lose!");
                        break;
                }
                System.out.println("Thanks for the game!");
            case "no":
                System.out.println("Bye!");
                break;
        }

    }
}
