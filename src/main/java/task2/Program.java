package task2;

public class Program {
    public static void main(String[] args) {
        try {
            int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // массив не был объявлен
            int d = 0;
            double catchedRes1 = intArray[8] / d; //тут получим исключение, но мы его обрабатываем
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
