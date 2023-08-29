package task4;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        String inputString = inputString("Введите строку: ");
        System.out.println("Вы ввели: " + inputString);
    }

    public static String inputString(String message) {
        String result = new String();
        boolean validInput = false;
        Scanner scanner = new Scanner(System.in);

        while (!validInput) {
            System.out.print(message);
            try {
                result = scanner.nextLine();
                if (result.isEmpty()) {
                    throw new Exception("Пустые строки вводить нельзя.");
                }
                validInput = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return result;
    }
}