import java.util.Scanner;

public class MethodsExercises {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println(add(2, 3));
//        System.out.println(subtract(5, 2));
//        System.out.println(multiply(3, 5));
//        System.out.println(division(15, 3));
//        System.out.println(division(5, 0));
//        System.out.println(division(0, 5));
//        System.out.println(mod(20, 5));
//        System.out.println(getInteger(1, 10));
//        System.out.println(getFactorial(1, 10));
        System.out.println(rollDice(4, 2));

//
//

    }
//
//
//    public static int add(int num1, int num2) {
//        return num1 + num2;
//    }
//
//
//    public static int subtract(int num1, int num2) {
//        return num1 - num2;
//    }
//
//
//    public static int multiply(int num1, int num2) {
//        return num1 * num2;
//    }
//
//
//    public static int division(int num1, int num2) {
//        if (!(num2 == 0)) {
//            return num1 / num2;
//        } else {
//            System.out.println("cannot be done");
//            return -1;
//        }
//
//    }
//
//    public static int mod(int num1, int num2) {
//        return num1 % num2;
//
//    }
//
//
//    public static int getInteger(int min, int max) {
//        System.out.print("Enter a number between " + min  + " and " + max + ":");
//        int userInput = Integer.parseInt(scanner.next());
//        if (userInput >= min && userInput <= max) {
//            return userInput;
//        } else {
//            System.out.println("not in range");
//           return getInteger(min, max);
//        }
//    }

//    public static String getFactorial() {
//        long num;
//        long factorial = 1;
//        System.out.println("Enter a nun 1 to 10");
//        num = Long.parseLong(scanner.next());
//
//        for (int i = 1; i <= num; i++) {
//            factorial = factorial * i;
//        }
//        return num + "!=" + factorial;
//
//
//    }


    // Ask the user to enter the number of sides for a pair of dice





    // Roll the dice and display the results
    public static int rollDice(int sideNum) {

        System.out.println("Enter the number of sides: ");
        int sideNum = Integer.parseInt(scanner.next());
        int die1 = rollDice(sideNum);
        int die2 = rollDice(sideNum);


        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);


        return (int) (Math.random() * sideNum) + 1;
    }


}