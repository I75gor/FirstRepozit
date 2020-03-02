package HomeTask3;

import java.util.Scanner;

public class User {
    public static int userInput3() {
        Scanner scanner = new Scanner(System.in);
        try {
            int input = scanner.nextInt();
            return input;
        } catch (Exception ex) {
            System.out.println("Обнаружено исключение");
            return 0;
        }
    }

//    public static int isTime(int input) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        boolean matcher = Pattern.matches("^\\d{1,2}$", str);
//        if (matcher) {
//            System.out.println("Проверка на числовое значение введенных данных пройдено");
//            Integer i = new Integer.valueOf(str);
//
//        } else {
//            System.out.println("Введеено не корректное значение");
//
//        }
//        return i;
//    }
}
