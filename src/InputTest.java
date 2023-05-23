
import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

//            System.out.print("Enter a string: ");
//            String str = input.getString();
//            System.out.println("String entered: " + str);

        String str = input.getString("Enter a string: ");
        System.out.println("String entered: " + str);


//            System.out.println("Enter yes/no");
//            boolean yn = input.yesNo();
//            System.out.println("Yes/No entered: " + yn);

        boolean yn = input.yesNo("Enter yes/no: ");
        System.out.println("Yes/No entered: " + yn);

//        System.out.print("Enter an integer between 1 and 10: ");
//        int num = input.getInt(1, 10);
//        System.out.println("Integer entered: " + num);

        int num = input.getInt(1, 10, "Enter an integer between 1 and 10: ");
        System.out.println("Integer entered: " + num);


//        System.out.print("Enter an integer: ");
//        int anyNum = input.getInt();
//        System.out.println("Integer entered: " + anyNum);

        int anyNum = input.getInt("enter an integer: ");
        System.out.println("Integer entered: " + anyNum);

//
//        System.out.print("Enter a decimal number between 0.5 and 1.5: ");
//        double decimalNum = input.getDouble(0.5, 1.5);
//        System.out.println("Decimal number entered: " + decimalNum);

        double decimalNum = input.getDouble(0.5, 1.5, "Enter a decimal number between 0.5 and 1.5: ");
        System.out.println("Decimal number entered: " + decimalNum);


//        System.out.print("Enter a decimal number: ");
//        double anyDecimalNum = input.getDouble();
//        System.out.println("Decimal number entered: " + anyDecimalNum);

double anyDecimalNum = input.getDouble("Enter a decimal number: ");
        System.out.println("Decimal number entered: " + anyDecimalNum);
}
}

