package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo(){
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y");
    }

//    public int getInt(){
//        return this.scanner.nextInt();
//    }
//
//    public double getDouble(){
//        return this.scanner.nextDouble();
//    };


    public int getInt(int min, int max, String prompt){
        System.out.println(prompt);
        int userNum = Integer.valueOf(this.getString());
        if(userNum >= min && userNum <= max){
            return userNum;
        }
        System.out.println("Integer not between bounds. Enter integer: ");
        return getInt(min, max,prompt);
    }

    public int getInt(int min, int max){
        int userNum = Integer.valueOf(this.getString());
        if(userNum >= min && userNum <= max){
            return userNum;
        }
        System.out.println("Integer not between bounds. Enter integer: ");
        return getInt(min, max);
    }

    public double getDouble(double min, double max, String prompt){
        System.out.println(prompt);

        double userNum = Double.valueOf(this.getString());
        if(userNum >= min && userNum <= max){
            return userNum;
        }
        System.out.println("Double not between bounds. Enter a double: ");
        return getDouble(min, max,prompt);
    }

    public static int getInt() {
        while (true) {
            try {
                String input = getString();
                return Integer.valueOf(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
                return getInt();
            }
        }
    }

    public static double getDouble() {
        while (true) {
            try {
                String input = getString();
                return Double.valueOf(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                return getDouble();
            }
        }
    }

}
