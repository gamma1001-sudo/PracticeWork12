import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print(
                    "Введите число: "
            );

            String input =
                    scanner.nextLine();

            int number =
                    Integer.parseInt(input);

            System.out.println(
                    "Результат деления 100 / "
                            + number
            );

            System.out.println(
                    100 / number
            );

        } catch (ArithmeticException e) {

            System.out.println(
                    "Ошибка: деление на ноль!"
            );

        } catch (NumberFormatException e) {

            System.out.println(
                    "Ошибка: введено не число!"
            );

        } finally {

            System.out.println(
                    "Блок finally выполнен"
            );
        }

        scanner.close();
    }
}