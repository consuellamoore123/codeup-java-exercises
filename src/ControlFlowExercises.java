import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
        for (int i = 5; i <= 15; i++) {
            System.out.println(i);
        }


        int i = 0;
        while (i <= 100) {
            System.out.println(i);
            i += 2;
        }

        int j = 100;
        while (j >= -10) {
            System.out.println(j);
            j -= 5;
        }

        long k = 2;
        while (k < 1000000) {
            System.out.println(k);
            k *= k;
        }

        for (long l = 2; l <= 1000000; l *= l) {
            System.out.println(l);
        }

        for (int m = 1; m <= 100; m++) {
            if (m % 3 == 0 && m % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (m % 3 == 0) {
                System.out.println("Fizz");
            } else if (m % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(m);
            }
        }

        Scanner scanner = new Scanner(System.in);
        String choice;


        do {
            System.out.print("What number would you like to go up to? ");
            int number = scanner.nextInt();

            System.out.println("Here is your table!");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");

            for (int n = 1; n <= number; n++) {
                int square = n * n;
                int cube = n * n * n;
                System.out.printf("%-6d | %-7d | %-5d%n", n, square, cube);
            }

            System.out.print("Do you want to continue? (y/n) ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("y"));



        do {
            System.out.print("Enter a numerical grade (0-100): ");
            int numberGrade = scanner.nextInt();

            String letterGrade;
            if (numberGrade >= 88 && numberGrade <= 100) {
                letterGrade = "A";
            } else if (numberGrade >= 80 && numberGrade <= 87) {
                letterGrade = "B";
            } else if (numberGrade >= 67 && numberGrade <= 79) {
                letterGrade = "C";
            } else if (numberGrade >= 60 && numberGrade <= 66) {
                letterGrade = "D";
            } else {
                letterGrade = "F";
            }

            System.out.println("Letter Grade: " + letterGrade);

            System.out.print("Do you want to continue? (yes/no): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("yes"));

    }
}












