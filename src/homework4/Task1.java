package homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    // Написать программу, которая будет считывать введенные пользователем слова с клавиатуры слова, и склеивать их
    // в одно предложение до тех пор, пока пользователь не введет с клавитуры слово STOP. Все слова введенные до этого
    // должны отобразится в консоли одним предложением.

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter the word:");
        String words = scanner.nextLine();
        String sentense = "";

        while (!words.equals("STOP")) {
            sentense = sentense.concat(words) + " ";
            System.out.println("Enter the word:");
            words = scanner.nextLine();
            }
        System.out.println(sentense);
        }
    }
