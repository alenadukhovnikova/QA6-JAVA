package homework3;

import java.util.Scanner;

public class Task1 {
    //У вас есть строка “Я тестирую замечательно. Что еще нужно?”, которую нужно ввести с клавиатуры в консоль.

    //Необходимо при помощи только метода next() класса Scanner (не используем метод nextLine()) присвоить перемнным
    // типа String следующие значения: string1 = Я string2 = тестирую string3 = замечательно string4 = Что еще нужно?
    // Помимо string1, string2, string3, string4 новых переменных создавать нельзя.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку : Я тестирую замечательно. Что еще нужно?");
        String string1 = scanner.next();
        System.out.println(string1);
        String string2 = string1.substring(1);
        System.out.println(scanner.next());
        String string3 = string2.substring(9);
        System.out.println(scanner.next());
        String string4 = string3.substring(14);
        System.out.println(scanner.next());
       // System.out.println(scanner.next() + scanner.next()+scanner.next() );
    }
}
