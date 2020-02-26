package HomeTask1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число");
        int a = UserInput.UserGet();
        if ( a%2==0){
            System.out.println("Число четное");
        } else System.out.println("Число не четное");

    }
}
