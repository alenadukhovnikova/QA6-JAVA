package homework4;

import java.util.Scanner;

public class Task2 {
    //Написать программу в которой пользователь вводит с клавиатуры число, а программа определяет, является она полиндромом
    // или нет. И выводит данную информацию на экран.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");

        String number1 = scanner.nextLine();
        String number2 = "";
        for (int i = number1.length() - 1; i >= 0; i--) {
            number2 = number2 + number1.charAt(i);
        }
        System.out.println(number2);
        if (number2.equals(number1)) {
            System.out.println("palindrome");
        } else {
            System.out.println("no palindrome");

        }
    }
}