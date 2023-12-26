package homework10.Task3;

import homework10.Task1.SaleOfGoods;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exceptions.DontEnoughtMoney, Exceptions.ProhibitedGoodsException, Exceptions.DividedToFamilyException {
        Father father = new Father("Anatoliy", 100);

        Father.ToGetShopping("beer", 20);

    }
}
