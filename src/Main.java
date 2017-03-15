import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Объявление и создание массива данных
        String[] array = new String[6];
        array[0] = "ОНТ";
        array[1] = "Беларусь 1";
        array[2] = "MTV";
        array[3] = "Euronews";
        array[4] = "THT";
        array[5] = "Discovery";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер канала(0-5)");
        int numberOfChannel = scanner.nextInt();

        System.out.println("Вы включили канал: " + array[numberOfChannel]);



        /*
        // Вызов библиотеки для ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);
        // Объявляем переменную для ввода текста и присвоения значения
        String str = scanner.nextLine();
        // Вывод информационного сообщения на консоль
        System.out.println("Вы ввели строку: " + str);

        String[] array = str.split(" ");

        for (int i =0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        */
    }
}
