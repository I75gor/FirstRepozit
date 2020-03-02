package HomeTask1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cost = 0;
        int hour = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите почасовую оплату");
        try {
            cost = sc.nextInt();
        } catch (Exception ex) {
            System.out.println("Неверный формат данных");
        }
        System.out.println("Введите отработанное время");
        try {
            hour = sc.nextInt();
        } catch (Exception ex){
            System.out.println("Неверный формат данных");
        }
        getSalary(cost, hour);
    }

    public static double getSalary(int cost, int hour) {
        double salary = 0;
        if (isDataError(cost, hour)) {
            if (hour < 60) {
                salary = cost * hour;
            } else {
                salary = 1.5 * cost * hour;
            }
            System.out.println("Зарплата рабочего равна " + salary);
        }
        return salary;
    }

    public static boolean isDataError(int cost, int hour) {
        if (cost < 8) {
            System.out.println("Оплата должна быть больше 8 уев");
            return false;
        } else if (hour > 60) {
            System.out.println("Часов должно быть меньше 60 часов");
            return false;
        } else return true;
    }

}
