import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your message (press Enter to quit):");

        while (true) {
            String message = scanner.nextLine().trim();

            if (message.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else if (message.endsWith("?")) {
                System.out.println("Sure.");
            } else if (message.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else {
                System.out.println("Whatever.");
            }

            if (message.isEmpty()) {
                // Exit the loop if the input is empty
                break;
            }
        }
    }
}
