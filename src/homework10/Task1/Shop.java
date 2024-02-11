package homework10.Task1;

public class Shop implements SaleOfGoods {
    private String nameOftheShop;

    public String getNameOftheShop() {
        return nameOftheShop;
    }

    public void setNameOftheShop(String nameOftheShop) {
        this.nameOftheShop = nameOftheShop;
    }

    public Shop(String nameOftheShop) {
        this.nameOftheShop = nameOftheShop;
    }

    @Override
    public void saleOfGood() {

    }
    public void getInfo(SalesMan salesMan, Buyer buyer, Purchase purchase){

        if ((salesMan.getAge() < 18 ||  purchase.isAlcohol() || buyer.isHonesty()) == false) {
            System.out.println(" Уважаемый " + buyer.getNameofBuyer() + " , продавец " + salesMan.getNameOfSalesMan() + " нашего магазина " +
                    nameOftheShop + ", не продаст вам этот товар " + purchase.getNameOfPurchase() + ", в них " + purchase.isAlcohol() +
                    " алкогольная продукция, а ваш возраст " + salesMan.getAge() + " .Стоимость вашей покупки равна " +
                    purchase.getCountOfPurchase() + " Вот вам скидка " + salesMan.isDiscount());
        }else {
            System.out.println(" Уважаемый " + buyer.getNameofBuyer() + " , продавец " + salesMan.getNameOfSalesMan() + " нашего магазина " +
                    nameOftheShop + ", продаст вам этот товар " + purchase.getNameOfPurchase() + ", в них " + purchase.isAlcohol() +
                    " алкогольная продукция, а ваш возраст " + salesMan.getAge() + " . Стоимость вашей покупки равна " +
                    purchase.getCountOfPurchase() + " Вот вам скидка " + salesMan.isDiscount());
        }


    }

}
   // Уважаемый {Имя покупателя}, продавец {Имя продавца} нашего магазина “{Название магазина}”, продаст вам этот товар
//   {Название товара}, в них есть алкогольная продукция, а ваш возраст {Возраст покупателя}. Стоимость вашей
//   покупки равна {Стоимость покупки} Вот вам скидка
