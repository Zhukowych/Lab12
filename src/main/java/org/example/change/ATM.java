package org.example.change;

public class ATM {

    private final CoinMachine coinMachine;

    public ATM() {
        this.coinMachine = new Coin500(new Coin200(new Coin100(new Coin10(null))));
    }

    public void receiveMoney(int money) {
        this.coinMachine.receiveCoins(money);
    }

}
