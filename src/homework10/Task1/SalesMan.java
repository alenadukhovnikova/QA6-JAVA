package homework10.Task1;

public class SalesMan implements SaleOfGoods{
    private String nameOfSalesMan;
    private int age;
    private boolean discount;

    public String getNameOfSalesMan() {
        return nameOfSalesMan;
    }

    public void setNameOfSalesMan(String nameOfSalesMan) {
        this.nameOfSalesMan = nameOfSalesMan;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public SalesMan(String nameOfSalesMan, int age, boolean discount) {
        this.nameOfSalesMan = nameOfSalesMan;
        this.age = age;
        this.discount = discount;
    }

    @Override
    public void saleOfGood() {

    }
}
