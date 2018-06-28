import java.util.*;
public class DoJo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number");
        String input = scanner.next();

        LCD lcd = new LCD();
        String output = lcd.convert(input);

        System.out.println(output);
    }
}
