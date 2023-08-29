package task1;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        float enteredFloat = readFloatNum("Введите дробное число: ");
        System.out.println("Вы ввели: " + enteredFloat);
    }

    public static float readFloatNum(String message) {
        float result = 0.0f;
        boolean validInput = false;
        Scanner scanner = new Scanner(System.in);

        while (!validInput) {
            System.out.print(message);
            try {
                result = Float.parseFloat(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода.");
            }
        }

        return result;
    }
}