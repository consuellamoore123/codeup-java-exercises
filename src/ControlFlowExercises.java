import java.util.Scanner;

public class ControlFlowExercises {

    //Create an integer variable i with a value of 5.
    //Create a while loop that runs so long as i is less than or equal to 15
    //Each loop iteration, output the current value of i, then increment i by one.
    public static void main(String[] args) {
//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }

        int b = 5;
        while (b <= 15) {
            System.out.print(b);
            b++;
        }
        // Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//        int i = 0;
//        while (i <= 100) {
//            System.out.println(i);
//            i += 2;
//        }

        int i = 0;
        do {
            System.out.println(i);
            i += 2;
        } while (i <= 100);


        //Alter your loop to count backwards by 5's from 100 to -10.

//        int j = 100;
//        while (j >= -10) {
//            System.out.println(j);
//            j -= 5;
//        }

        int j = 100;
        do {
            System.out.println(j);
            j -= 5;
        } while (j >= -10);

//Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//
//
//        long k = 2;
//        while (k < 1000000) {
//            System.out.println(k);
//            k *= k;
//        }

        long k = 2;
        do {
            System.out.println(k);
            k *= k;
        } while (k < 1000000);


//Refactor the previous two exercises to use a for loop instead.

        for (long l = 2; l <= 1000000; l *= l) {
            System.out.println(l);
        }


        //Fizzbuzz
        //
        //One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
        //
        //Write a program that prints the numbers from 1 to 100.
        //For multiples of three: print “Fizz” instead of the number.
        //For the multiples of five: print “Buzz”.
        //For numbers which are multiples of both three and five: print “FizzBuzz”.


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

        //Display a table of powers.
        //
        //Prompt the user to enter an integer.
        //Display a table of squares and cubes from 1 to the value entered.
        //Ask if the user wants to continue.
        //Assume that the user will enter valid data.
        //Only continue if the user agrees to.

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

//Convert given number grades into letter grades.
//
//Prompt the user for a numerical grade from 0 to 100.
//Display the corresponding letter grade.
//Prompt the user to continue.
//Assume that the user will enter valid integers for the grades.
//The application should only continue if the user agrees to.
//Grade Ranges:
//
//A : 100 - 88
//B : 87 - 80
//C : 79 - 67
//D : 66 - 60
//F : 59 - 0

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

        scanner.close();

    }
}












