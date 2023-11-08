package homework7;

import java.util.Arrays;

public class Task2 {
   // Написать перегруженный метод, который может:
   //Не принимать никаких значений, тогда он будет выводить на консоль сообщение типа: "Я пустой".
   //Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.
   //Принимать в качестве параметров массив строк, тогда он будет выводить на консоль все его значения через пробел.
   //Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов массива.
   //Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа:
    // "Ваше сообщение - "%%%%%%%%", ваше число -  $", где "%%%%%%%%" и $ ваши введенные строка и число соответственно.

    public void action () {
        System.out.println("i am empty");
    }
    public void action (String string) {
        System.out.println(string);
    }
    public void action (String[] strings) {
        for (int i=0; i<strings.length; i++)
            System.out.print(strings[i] + " ");
        System.out.println();
    }
    public void action (int [] numbers) {
        int result=0;
        for (int i = 0; i< numbers.length; i++)
            result =  result + numbers[i];
        System.out.println( "Cумма всех элементов массива = " + result);
    }
    public void action (int x, String text) {
        System.out.println("Ваше сообщение - "+ text + "Ваше число - " + x);
    }

    public static void main(String[] args) {
        Task2 overload = new Task2 ();
      overload.action();
      overload.action("String");
      overload.action(new String[]{"One","Two","123"});
      overload.action(new int[]{23,12,21});
      overload.action(6, "times ");


    }

}
