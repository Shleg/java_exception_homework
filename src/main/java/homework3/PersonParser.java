package homework3;

import java.text.ParseException;
;

public class PersonParser {
    public static Person parse(String input) throws ParseException {
        String[] parts = input.split(" ");

        if (parts.length < 6) {
            throw new ParseException("Неправильное количество данных", 0);
        }

        String lastName = "";
        String firstName = "";
        String middleName = "";
        String birthDateStr = "";
        String phoneNumberStr = "";
        char gender = ' ';

        // Проход по всем частям ввода и определение их типа
        for (String part : parts) {
            if (part.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
                birthDateStr = part;
            } else if (part.matches("\\d+")) {
                phoneNumberStr = part;
            } else if (part.equalsIgnoreCase("m") || part.equalsIgnoreCase("f")) {
                gender = part.charAt(0);
            } else {
                if (lastName.isEmpty()) {
                    lastName = part;
                } else if (firstName.isEmpty()) {
                    firstName = part;
                } else {
                    middleName = part;
                }
            }
        }

        // Проверка наличия обязательных данных
        if (lastName.isEmpty() || firstName.isEmpty() || birthDateStr.isEmpty() || phoneNumberStr.isEmpty() || gender == ' ') {
            throw new ParseException("Неправильный формат данных", 0);
        }


        long phoneNumber;
        try {
            phoneNumber = Long.parseLong(phoneNumberStr);
        } catch (NumberFormatException e) {
            throw new ParseException("Неправильный формат номера телефона", 0);
        }

        return new Person(lastName, firstName, middleName, birthDateStr, phoneNumber, gender);
    }
}
