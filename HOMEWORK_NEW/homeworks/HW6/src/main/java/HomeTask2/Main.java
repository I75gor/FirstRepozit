package HomeTask2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String distance;
        String time;
        System.out.println("Введите расстояние");
        Scanner sc = new Scanner(System.in);
        do {
            distance = sc.nextLine();
        }
        while (isValidData(distance));
        System.out.println("Введите время для преодоления расстояния");
        do {
            time = sc.nextLine();
        } while (isValidData(time));
        System.out.println(getSpeed(distance, time) + " киллометров в час");

    }

    public static boolean isValidData(String data) {
        if (data.matches("^\\d{1,10}$")) {
            System.out.println("Введены корректные данные");
            return false;
        } else {
            System.out.println("Введены не корректные данные");
            return true;
        }
    }

    public static double getSpeed(String distance, String time) {
        double Speed = -1;
        int distanceInt = Integer.parseInt(distance);
        int timeInt = Integer.parseInt(time);
        try {
            Speed = distanceInt / timeInt;
        } catch (Exception eX) {
            System.out.println("Division by zero");
        }
        return Speed;
    }
}



