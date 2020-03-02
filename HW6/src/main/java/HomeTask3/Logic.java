package HomeTask3;

public class Logic {
    public static void whatTime(int time) {
        if (time >= 0 && time < 6) System.out.println("Good night");
        else if (time >= 6 && time < 13) System.out.println("Good morning");
        else if (time >= 13 && time < 17) System.out.println("Good day");
        else if (time >= 17 && time < 24) System.out.println("Good evening");
        else System.out.println("Ввели число не относящееся к диапазону 0 - 24 часа");
    }
}
