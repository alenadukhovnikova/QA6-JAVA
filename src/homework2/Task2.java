package homework2;

public class Task2 {
   // Создать строку string = "Testing, is my favourite job".
    //Вывести на экран отдельно каждое слово и длину этого слова в след виде:
    //Cлово1 = (значение слова), Длина этого слова = (значение длины слов).
    //Cлово2 = (значение слова), Длина этого слова = (значение длины слов).и т.д.
    //Вывести на консоль true, если первое слово длиннее остальных, в
    //противном случае вывести false.
   public static void main(String[] args) {
       String string = "Testing, is my favourite job";
       String lenght1 = string.substring(0 , 7);
       String result1 = "слово1 = " + string.substring(0 , 7)  + " Длина этого слова "
       + lenght1.length();
       System.out.println(result1);

       String lenght2 = string.substring(9, 11);
       String result2 = "слово2 = " + string.substring(9 , 11)  + " Длина этого слова "
               + lenght2.length();
       System.out.println(result2);

       String lenght3 = string.substring(12 , 14);
       String result3 = "слово3 = " + string.substring(12, 14)  + " Длина этого слова "
               + lenght3.length();
       System.out.println(result3);

       String lenght4 = string.substring(15 , 24);
       String result4 = "слово4 = " + string.substring(15 , 24)  + " Длина этого слова "
               + lenght4.length();
       System.out.println(result4);

       String lenght5 = string.substring(25 , 28);
       String result5 = "слово5 = " + string.substring(25 , 28)  + " Длина этого слова "
               + lenght5.length();
       System.out.println(result5);

       int countOfSymbols1 = lenght1.length();
       int countOfSymbols2 = lenght2.length();
       int countOfSymbols3 = lenght3.length();
       int countOfSymbols4 = lenght4.length();
       int countOfSymbols5 = lenght5.length();

       System.out.println(countOfSymbols1 > countOfSymbols2 && countOfSymbols1 > countOfSymbols3 &&
               countOfSymbols1 > countOfSymbols4 && countOfSymbols1 > countOfSymbols5);


   }
}
