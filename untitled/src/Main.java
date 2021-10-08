public class Main {
    public static void main(String[] args) {
        long initialAccount = 100;
        long depositAmount = 2000;
        long bonusRuble = depositAmount / 100;
        if (depositAmount >= 1000) {
            bonusRuble = depositAmount / 100;
        }
        if (depositAmount < 1000) {
            bonusRuble = 0;
        }
        long finalAccount = initialAccount + depositAmount + bonusRuble;
        System.out.println(finalAccount);
        System.out.println(bonusRuble);
    }
}
