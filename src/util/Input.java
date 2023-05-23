package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);

    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo(String prompt) {
        System.out.print(prompt);
        String input = scanner.nextLine().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }

    public int getInt(int min, int max, String prompt) {
        int number = getInt(prompt);
        while (number < min || number > max) {
            System.out.printf("Please enter an integer between %d and %d: ", min, max);
            number = getInt(prompt);
        }
        return number;
    }


        public int getInt (String prompt) {
            System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.print("Invalid input. Please enter an integer: ");
            }
            return scanner.nextInt();
        }

        public double getDouble(double min, double max, String prompt) {
            double number = getDouble(prompt);
            while (number < min || number > max) {
                System.out.printf("Please enter a decimal number between %.2f and %.2f: ", min, max);
                number = getDouble(prompt);
            }
            return number;
        }

        public double getDouble(String prompt) {
            System.out.print(prompt);
            while (!scanner.hasNextDouble()) {
                scanner.next();
                System.out.print("Invalid input. Please enter a decimal number: ");
            }
            return scanner.nextDouble();
        }
    }

