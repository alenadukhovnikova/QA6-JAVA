package lesson3;

public class Homework2 {
   // Создать переменную string1 = "This line that i want to cut, cause it is too long".
   // Создать строку string2 в которой должно быть помещено значение строки string1,
   // Обрезанное до "This line that i want to cut, cause".
   // Создать строку string3 на основе string2 которое будет содержать значение
   //     "This line that don't want to cut, cause it is perfect".
    //Вывести на консоль каждое сообщение и его длину.
   public static void main(String[] args) {
       String string1 = "This line that i want to cut, cause it is too long";
       String string2  = string1.substring(0, string1.length()-15);
       String string3 = string2.concat(" it is perfect");

   }

}
