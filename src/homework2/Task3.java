package homework2;

public class Task3 {
    //При применении к массиву строк поля length, можно узнать сколько
    //элементов находится в массиве.
    //Тоесть если у Вас есть массив строк типа: String[] arrayOfString;
    //то при вызове поля lenth:
    //int size = arrayOfString.length;
    //можно получить какое количество символов находится в данном массиве.
    //Попробовать, используя метод split и информацию по поводу поля length, вывести на экран какое количество раз
    //символ 'a' встречается в  строке:
           // "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there.
    // And we can use the split method and the length method.
    // "Решить данную задачу с учетов верхнего и нижнего регистра символа 'a'.
    public static void main(String[] args) {
        String text = "Completely random text in English. In it, we just need to determine how many times the character" +
                " 'a' occurs there. And we can use the split method and the length method.";
     int stringLength = text.length();
     System.out.println(stringLength);

        System.out.println(text.toLowerCase());
        String[] arrayOfString = text.split("a");
        System.out.println(arrayOfString.length);
    }
}
