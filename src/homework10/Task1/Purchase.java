package homework10.Task1;

public class Purchase implements SaleOfGoods {

    private int CountOfPurchase;
    private String nameOfPurchase;
    private boolean isAlcohol;

    public int getCountOfPurchase() {
        return CountOfPurchase;
    }

    public void setCountOfPurchase(int countOfPurchase) {
        CountOfPurchase = countOfPurchase;
    }

    public String getNameOfPurchase() {
        return nameOfPurchase;
    }

    public void setNameOfPurchase(String nameOfPurchase) {
        this.nameOfPurchase = nameOfPurchase;
    }

    public boolean isAlcohol() {
        return isAlcohol;
    }

    public void setAlcohol(boolean alcohol) {
        isAlcohol = alcohol;
    }

    public Purchase(int countOfPurchase, String nameOfPurchase, boolean isAlcohol) {
        CountOfPurchase = countOfPurchase;
        this.nameOfPurchase = nameOfPurchase;
        this.isAlcohol = isAlcohol;
    }

    @Override
    public void saleOfGood() {

    }

}

