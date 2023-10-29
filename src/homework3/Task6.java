package homework3;

import javax.swing.*;
import java.util.Scanner;

public class Task6 {
   //Используя оператор switch написать программу, которая выводит на консоль ссылку для скачивания программы.
   // Из выбора программ взять: IntelliJ IDEA, Git, Java. Из выбора ОС взять: Linux, macOS, Windows.
   // Программа должна спросить пользователя какая программа ему интересна, также спросить какую ОС он использует,
   // а после вывести в консоль необходимую ссылку. Если программа с таким названием не существует выводит сообщение
   // в консоль, о том что такой программы не существует. Если указанной пользователем ОС нет, то выводится сообщение
   // в консоль, о том что такой ОС не существует.
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("what program do you need?");
      String program = scanner.nextLine();
      switch (program) {
         case ("intellij"):
            System.out.println("what operating system do you have?");
            String os = scanner.nextLine();
            switch (os) {
               case ("linux"):
                  System.out.println("Intellij download link for Linux");
                  break;
               case ("windows"):
                  System.out.println("Intellij download link for Windows");
                  break;
               case ("macOS"):
                  System.out.println("Intellij download link for macOS");
                  break;
               default:
                  System.out.println("no such operating system exists");
            }

            break;

         case ("git"):
            System.out.println("what operating system do you have?");
            String os1 = scanner.nextLine();
            switch (os1) {
               case ("linux"):
                  System.out.println("Git download link for Linux");
                  break;
               case ("windows"):
                  System.out.println("Git download link for Windows");
                  break;
               case ("macOS"):
                  System.out.println("Git download link for macOS");
                  break;
               default:
                  System.out.println("no such operating system exists");
            }
            break;


         case ("java"):
            System.out.println("what operating system do you have?");
            String os2 = scanner.nextLine();
            switch (os2) {
               case ("linux"):
                  System.out.println("Java download link for Linux");
                  break;
               case ("windows"):
                  System.out.println("Java download link for Windows");
                  break;
               case ("macOS"):
                  System.out.println("Java download link for macOS");
                  break;
               default:
                  System.out.println("no such operating system exists");
            }
            break;
         default:
         System.out.println("no such program exists");

      }
   }

}