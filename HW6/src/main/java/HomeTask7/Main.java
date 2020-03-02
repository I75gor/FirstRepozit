package HomeTask7;

public class Main {
    public static void main(String[] args) {
        listFaсt(2, 5);

    }

    public static void listFaсt(int arrayMin, int arrayMax) {
        int size = arrayMax - arrayMin + 1;
        int[] arrayParent = new int[size];
        int[] arrayFaсt = new int[size];
        System.out.println("Parent array: ");
        for (int i = 0; i < arrayParent.length; i++) {
            arrayParent[i] = arrayMin;
            System.out.print(arrayParent[i] + " ");
            arrayMin++;
        }
        System.out.println("\n"+"Factorial array:");

        for (int i = 0; i < arrayParent.length; i++) {
            int result = 1;
            for (int j = 1; j <= arrayParent[i]; j++) {
                result = result * j;
            }
            arrayFaсt[i] = result;
            System.out.print(arrayFaсt[i] + " ");
        }
    }
}
