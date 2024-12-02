package org.example.change;

public class Coin5 extends CoinMachine {

    public static final int DENOMINATION = 5;

    public Coin5(CoinMachine nextCoinMachine) {
        super(DENOMINATION, nextCoinMachine);
    }

}
