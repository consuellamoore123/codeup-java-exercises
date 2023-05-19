

public class MethodsExercises {


    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(subtract(5, 2));
        System.out.println(multiply(3, 5));
        System.out.println(division(15, 3));
        System.out.println(division(5,0));
        System.out.println(mod(20, 5));
//        System.out.print("Enter a number between 1 and 10: ");
//

    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }


    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }


    public static int division(int num1, int num2) {
        if (!(num2 == 0)) {
            return num1 / num2;
        }
        System.out.println("cannot be done");
        return -1;
    }


        public static int mod ( int num1, int num2){
            return num1 % num2;

        }

//    public static int getInteger( int min, int max){
//            int userInput = getInteger(1, 10);
//        }
    }


