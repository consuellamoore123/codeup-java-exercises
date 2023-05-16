import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
//
//        double pi = 3.14159;
//        System.out.printf("The value of %s is approximately 3.14.", pi);
////
//
//
//        System.out.print("type three words ");
//        String userInput = sc.nextLine();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//
//
//
//
//        System.out.print("Enter the length of the classroom: ");
//        double length = Double.parseDouble(sc.nextLine());
//
//        System.out.print("Enter the width of the classroom: ");
//        double width = Double.parseDouble(sc.nextLine());
//
//        double area = length * width;
//        double perimeter = 2 * (length + width);
//
//        System.out.println("The area of the classroom is: " + area);
//        System.out.println("The perimeter of the classroom is: " + perimeter);


        sc.useDelimiter("\n"); // set delimiter to newline

        System.out.print("Enter the length of the classroom: ");
        int length = sc.nextInt();

        System.out.print("Enter the width of the classroom: ");
        int width = sc.nextInt();

        System.out.print("Enter the height of the classroom: ");
        int height = sc.nextInt();

        int area = length * width;
        int perimeter = 2 * (length + width);
        int volume = length * width * height;

        System.out.println("The area of the classroom is: " + area);
        System.out.println("The perimeter of the classroom is: " + perimeter);
        System.out.println("The volume of the classroom is: " + volume);


        sc.close();
    }

}


