package homework3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Пользователь вводит с клавиатуры три целочисленных значения. На экран выводится информация можно
        //ли из этих сторон построить треугольник. (необходимо вспомнить правило построения треугольника по трем
        //сторонам).
        Scanner variable = new Scanner(System.in);
        System.out.println("введите три целочисленных значения сторон треугольника");
        int a = variable.nextInt();
        int b = variable.nextInt();
        int c = variable.nextInt();
        if (a>(b+c)) {
            System.out.println("значение сторон не подходит для построения треугольника");
        } else if ( b>(a+c)) {
            System.out.println("значение сторон не подходит для построения треугольника");
        } else if (c>(a+b)) {
            System.out.println("значение сторон не подходит для построения треугольника");
        } else {
            System.out.println("значение сторон подходит для построения треугольника");
        }

    }
}
