package HomeWork6;

public class Main {
    public static void main(String[] args) {
        CreditCard card = new CreditCard();
        card.accountNumber = 98456321;
        card.currentSum = 300;

        card.addMoney(44);

        System.out.println(card.currentSum);

        card.payMoney(40);

        System.out.println(card.currentSum);

        System.out.println(card.getCurrentSumInInt());

        CreditCard myCard1 = new CreditCard();
        myCard1.accountNumber = 436576213;
        myCard1.currentSum = 1000;


        CreditCard myCard2 = new CreditCard();
        myCard2.accountNumber = 888263548;
        myCard2.currentSum = 560;

        CreditCard myCard3 = new CreditCard();
        myCard3.accountNumber = 12345678;
        myCard3.currentSum = 200;

        myCard1.addMoney(50);
        myCard2.addMoney(75);
        myCard3.payMoney(13);

        System.out.println("Current balance: " + myCard1.getCurrentSumInInt());
        System.out.println("Current balance: " + myCard2.getCurrentSumInInt());
        System.out.println("Current balance: " + myCard3.getCurrentSumInInt());


    }


}
