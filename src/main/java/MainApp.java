import java.util.*;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number or amount");
        String input = scanner.next();

        LCD lcd = new LCD();
        String output = lcd.convert(input);

        System.out.println(output);
    }

}
