package homework5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {
   //За допомогою java.util.Random програма загадує випадкове число в діапазоні[0-100] та пропонує гравцеві через
    // консоль ввести своє ім’я, яке зберігається в змінній name. • Перед початком на екран виводиться текст:
    // Let the game begin! • Сам процес гри обробляється у нескінченному циклі. • Гравцеві пропонується ввести число
    // в консоль, після чого програма порівнює загадану кількість з тим, що ввів користувач. • Якщо введене число
    // менше загаданого, програма виводить на екран текст: Your number is too small. Please, try again.. Якщо введене
    // число більше за загадане, то програма виводить на екран текст: Your number is too big. Please, try again..
    // Якщо введене число відповідає загаданому, то програма виводить текст: Congratulations, {name}!

   public static void main(String[] args) {
      Random random = new Random();
      int RandomInt = random.nextInt(100);
      System.out.println("Please, insert your name: ");

      Scanner scanner = new Scanner(System.in);
      String name = scanner.nextLine();
      System.out.println("Let the game begin!");

      String [] names = {name};

      while (true) {
         System.out.println( "Please, insert number: ");
         int number = scanner.nextInt();
         if (number< RandomInt) {
            System.out.println("Your number is too small. Please, try again.");
            continue;
         }
            if (number> RandomInt) {
               System.out.println("Your number is too big. Please, try again.");
            } else {
               System.out.printf("Congratulations, %s! ", name);
            }
         }
      }

   }

