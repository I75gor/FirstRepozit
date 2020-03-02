package HomeTask2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите три числа");
        int num1 = User.userInput2();
        int num2 = User.userInput2();
        int num3 = User.userInput2();

        System.out.println("Максимальное число " + isMax(num1, num2, num3));
        System.out.println("Максимальное число " + isMin(num1, num2, num3));
        System.out.println("Среднее арифметическое " + getAVG(num1, num2, num3));

    }

    public static int isMax(int num1, int num2, int num3) {
        int[] array = {num1, num2, num3};
        int i, max = 0;
        for (i = 0; i < 3; i++) {
            if (array[i] > max) max = array[i];

        }
        return max;
    }

    public static int isMin(int num1, int num2, int num3) {
        int [] array = {num1, num2, num3};
        int i, min=array[0];
        for (i = 0; i < 3; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }

    public static double getAVG(int num1, int num2, int num3) {

        return (num1 + num2 + num3) / 3;
    }

}
