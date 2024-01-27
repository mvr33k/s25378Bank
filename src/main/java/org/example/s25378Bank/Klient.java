package org.example.s25378Bank;

public class Klient {
    public Klient(double saldo) {
        ;
        this.id=++idCount;
        this.saldo=saldo;
    }

    private Integer id;

    public Integer getId() {
        return id;
    }

    private static Integer idCount=0;

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
