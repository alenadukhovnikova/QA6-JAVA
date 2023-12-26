package homework10.Task3;

public class Exceptions {
    public static class ProhibitedGoodsException extends Exception {
        public String getMessage() {
            return "The Shopping bag contains Tobacco or Beer, you cannot bye it";
        }
    }

    public static class DontEnoughtMoney extends Exception {
        public String getMessage() {
            return "You don't have enough money fof it purchase";
        }
    }

    public static class DividedToFamilyException extends Exception {
        public String getmessage() {
            return "You cannot divided your purchase to 3 people";
        }

    }

}
