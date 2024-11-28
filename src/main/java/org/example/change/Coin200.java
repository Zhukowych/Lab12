package org.example.change;

public class Coin200 extends CoinMachine {

    public static final int DENOMINATION = 200;

    public Coin200(CoinMachine nextCoinMachine) {
        super(DENOMINATION, nextCoinMachine);
    }


}
