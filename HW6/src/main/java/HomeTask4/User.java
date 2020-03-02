package HomeTask4;

import java.util.Scanner;

public class User {
    public static void UserInput() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Boolean isTrue = str.matches("^\\d{6}$");
        if (isTrue) {
            System.out.println("Input Ok");
            char[] array = str.toCharArray();
            int sum123 = 0, sum456 = 0;
            sum123 = array[0] + array[1] + array[2];
            sum456 = array[3] + array[4] + array[5];
            if (sum123 == sum456) {
                System.out.println("Number is Lucky");
            } else {
                System.out.println("Number is notLucky");
            }
        } else {
            System.out.println("Input data Error");
        }

    }

}

