package HomeWork6;

public class CreditCard {
    int accountNumber;
    float currentSum;

    void addMoney(int count) {
        currentSum = currentSum + count;

    }

    void payMoney(int count) {
        currentSum = currentSum - count;
    }

    int getCurrentSumInInt() {
        System.out.println("Card number: " + accountNumber);
        return (int) currentSum;
    }

}


