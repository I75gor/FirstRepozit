
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Введено число "+" исключение не вызвано");
        try {
            Integer.parseInt(str);
        } catch (Exception ex) {
            System.out.println("Введены символы");
        }


    }
}

