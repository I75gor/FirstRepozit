package HomeTask3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите время");
        int result = User.userInput3();
        Logic.whatTime(result);
    }
}