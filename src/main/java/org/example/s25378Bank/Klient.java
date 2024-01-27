package org.example.s25378Bank;

public class Klient {
    public Klient(int id, double saldo) {
        this.id=id;
        this.saldo=saldo;
    }

    private int id;

    public int getId() {
        return id;
    }

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
