package HomeTask2;

import java.util.Scanner;

public class User {
    public static int userInput2() {
        Scanner sc1 = new Scanner(System.in);
        try {
            return sc1.nextInt();
        } catch (Exception ex) {
            System.out.println("Выявлено исключение");
            return 0;
        }
    }
}
