package homework3;

import java.io.*;
import java.text.ParseException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Введите данные: ");
                String input = scanner.nextLine();

                if (input.equals("exit")) {
                    System.out.println("Программа завершена!");
                    break;
                }

                try {
                    Person person = PersonParser.parse(input);
                    String filename = "src/main/java/homework3/" + person.getLastName() + ".txt";
                    FileWriterUtil.writeToFile(filename, person.toString());
                    System.out.println("Данные записаны в файл " + filename);
                } catch (ParseException | IOException e) {
                    ExceptionHandler.handleException(e);
                }
            }
        }
    }
}

