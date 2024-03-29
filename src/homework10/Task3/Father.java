package homework10.Task3;

public class Father {
    //   Реализовать данную ситуацию в коде.

//• Отцу у которого есть имя и определенная сумма в кармане должен сходить в магазин.
    //      • В магазине есть 5 типов продуктов: яблоко, картошка, молоко, пиво и табак.
//• У каждого товара есть своя цена.
    //       • Отцу необходимо сделать покупку, максимум он может купить только два типа продуктов.
//• Но любой тип продуктов может быть куплен в любом количестве.
//    Т.е. он может купить только молоко. Или купить 3 молока, и 2 яблока. Но он не может купить яблоко, три пива и
//    две картофелины. Неприятная ситуация произойдет в нескольких ситуациях:

    ///   Если сумма покупки превышает количество денег в кармане отца.
    //   Если он принесет домой пиво либо табак.
//    Если количество хотябы одного из купленных товаров не будет делиться на три. (т.е. он не сможет поровну разделить
//    купленный продукт между собой, женой и ребенком)
    //   Реализовать данную ситуацию при помощи объектно ориентированного подхода. Постараться использовать перечислительный
    //   тип данных Enum. А также исключения. Постараться обработать все исключения в стороннем методе, а не в теле
    //   метода созданного у отца.

    //  В случае если отцу удасться избежать неприятной ситуации на консоль должно вывестись сообщение примерно такого типа:

    //  Уважаемый Валентин стоимость ваших покупок 150. Вы приобрели APPLE в количестве 3, и MILK в количестве 6.

    private static String name;
    private static int money;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Father(String name, int money) {
        this.name = name;
        this.money = money;

    }


    public static void ToGetShopping(String goods, int result) throws Exceptions.ProhibitedGoodsException, Exceptions.DontEnoughtMoney, Exceptions.DividedToFamilyException {
        if (name.equals("Tobacco") || name.equals("Beer")) {
            throw new Exceptions.ProhibitedGoodsException();
        } else {
            if (money < Goods.values().length) {
                throw new Exceptions.DontEnoughtMoney();
            } else {
                if (Goods.values().length % 3 != 0) {
                    throw new Exceptions.DividedToFamilyException();
                } else {
                    System.out.println(" Уважаемый " + name + " стоимость ваших покупок: " + result);
                }
            }
        }
    }

}

