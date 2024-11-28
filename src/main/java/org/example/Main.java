package org.example;

import org.example.change.ATM;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.receiveMoney(1000);
        System.out.println();
    }
}