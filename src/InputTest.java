
import util.Input;

public class InputTest {

    public static void main(String[] args) {
        Input inputOne = new Input();
        System.out.println("Get String: ");
        System.out.println(inputOne.getString());
        System.out.println("yesNo: ");
        System.out.println(inputOne.yesNo());
        System.out.println(inputOne.getInt(1, 10, "give me an integer between 1-10"));

    }
}

//
