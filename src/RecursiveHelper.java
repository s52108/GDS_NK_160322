import java.util.ArrayList;

public class RecursiveHelper {

    public static int multiplicate(int number) {
        if (number <= 0) {
            return 0;
        }
        if (number == 1) {
            return number;
        }
        return number * multiplicate(number - 1);
    }

    public static void main(String[] args) {
        int number = 3;
        System.out.println(multiplicate(number));
    }
}
