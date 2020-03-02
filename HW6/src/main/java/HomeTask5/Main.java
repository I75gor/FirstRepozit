package HomeTask5;

public class Main {
    public static void main(String[] args) {
        listEven(0, 10);
    }

    public static void listEven(int num1, int num2) {
        //System.out.println("Введите число 1"); //
        //Scanner scanner = new Scanner(System.in);
        //num1 = scanner.nextInt();
        //System.out.println("Введите число 2");
        //num2 = scanner.nextInt();
        int size = num2 - num1 + 1;
        int[] array = new int[size];
        System.out.println("Create array numbers from " + num1 + " before " + num2 + " size " + size);
        for (int i = 0; i < size; i++) {
            array[i] = num1;
            num1++;
        }
        System.out.print("All array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n" + "Sample even number: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}


