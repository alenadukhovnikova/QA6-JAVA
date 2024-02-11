package homework10.Task3;

import homework9.Family;

public enum Goods {
     Apples("Apple", 10, 1), Potatoes("Potatoes", 11, 1), Milk("Milk", 30, 1),
     Beer("Beer", 40, 1), Tobacco("Tobacco", 40, 1);
     private String name;
     private int price;
     private int countOfGoods;


    Goods(String name, int price, int countOfGoods) {
        this.name = name;
        this.price = price;
        this.countOfGoods = countOfGoods;
    }

    private int result = price*countOfGoods;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    Goods( int result) {
        this.result = result;
    }

    public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getPrice() {
         return price;
     }

     public void setPrice(int price) {
         this.price = price;

     }

    public int getCountOfGoods() {
        return countOfGoods;
    }

    public void setCountOfGoods(int countOfGoods) {
        this.countOfGoods = countOfGoods;
    }

    //public int goods1;
  //   public  int goods2;

   // Goods(int goods1, int goods2) {
 //       this.goods1 = goods1;
     //   this.goods2 = goods2;
  //  }

}





