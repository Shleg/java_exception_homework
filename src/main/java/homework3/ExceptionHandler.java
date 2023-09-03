package homework3;

public class ExceptionHandler {
    public static void handleException(Exception e) {
        System.out.println("Ошибка: " + e.getMessage());
        e.printStackTrace();
    }
}

