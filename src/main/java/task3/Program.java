package task3;

public class Program {
    public static void main(String[] args) /*throws Exception не нужно,
    так как добавлено отслеживание исключений */ {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        }
        catch (ArithmeticException ex) {
            System.out.println("Деление на 0!"); //добавил исключение деление на 0, так как может возникнуть
        }catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так..."); /*  Блоки catch должны идти в порядке
            от наиболее специфичных к более общим. В данном случае, Throwable (базовый класс для
            всех исключений и ошибок) блок следует перед остальными, и это приведет к ошибке компиляции.*/
        }
    }
    public static void printSum(Integer a, Integer b) /*throws FileNotFoundException здесь не нужно,
    так как метод не вызовет такого исключения */ {
        System.out.println(a + b);
    }

}
