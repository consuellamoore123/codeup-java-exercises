import java.util.Scanner;

public class ControlFlowExercises {

        public static void main (String[] args) {
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
                k*=k;
            }

            for (long l = 2; l <= 1000000; l*=l) {
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
                System.out.print("Enter a numerical grade (0-100): ");
                int numericalGrade = scanner.nextInt();

                String letterGrade;
                if (numericalGrade >= 88 && numericalGrade <= 100) {
                    letterGrade = "A";
                } else if (numericalGrade >= 80 && numericalGrade <= 87) {
                    letterGrade = "B";
                } else if (numericalGrade >= 67 && numericalGrade <= 79) {
                    letterGrade = "C";
                } else if (numericalGrade >= 60 && numericalGrade <= 66) {
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




