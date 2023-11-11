package homework8;

import java.util.Objects;

public class Computer {
    //Создать класс Computer c конструктором принимающим параметры
    //Марка тип String, цена тип int, оперативная память тип int, и видеокарта тип int.
    //Переопределить метод toString для вывода объекта класса в след. виде:

    //"Создан PC.
    //Имя = марка.
    //Цена = цена.
    //Видеокарта = объем видеокарты.
   //ОЗУ = Объем оперативной памяти."
    //Все поля класса Computer должны быть приватными.
    // Также создайте публичные методы для получения информации о полях класса Computer.
    //А также методы для изменения его полей.Переопределите метод equals и метод hashCode для вашего класса.
    //Сделайте так, чтобы компьютеры считались одинаковыми в случае если у них
   // равны значения полей марка, оперативная память и видеокарта.
   //В отдельном классе создайте объект класса компьютер, и выведите в консоль информацию о вашем объекте

    private String marka;
    private int price;
    private int ram;
    private int videoCart;

    @Override
    public String toString() {
        return "Создан РС." +
                "Имя = " + marka + '\'' +
                "Цена = " + price + '.' +
                "Видеокарта = " + videoCart + '.' +
                "ОЗУ = " + ram + '.';
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getVideoCart() {
        return videoCart;
    }

    public void setVideoCart(int videoCart) {
        this.videoCart = videoCart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;
        return ram == computer.ram && videoCart == computer.videoCart && Objects.equals(marka, computer.marka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marka, ram, videoCart);
    }

    public void getInfo(){
        System.out.println("name of the computer:" + marka);
        System.out.println("compyter`s price:" + price);
        System.out.println("count of memory:" + ram);
        System.out.println("videocard:" + videoCart);
    }

}
