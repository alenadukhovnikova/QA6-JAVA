package homework10.Task1;

public class Buyer implements SaleOfGoods {
    private String nameofBuyer;
    private boolean honesty;

    @Override
    public void saleOfGood() {

    }

    public String getNameofBuyer() {
        return nameofBuyer;
    }

    public void setNameofBuyer(String nameofBuyer) {
        this.nameofBuyer = nameofBuyer;
    }

    public boolean isHonesty() {
        return honesty;
    }

    public void setHonesty(boolean honesty) {
        this.honesty = honesty;
    }

    public Buyer(String nameofBuyer, boolean honesty) {
        this.nameofBuyer = nameofBuyer;
        this.honesty = honesty;
    }


}
