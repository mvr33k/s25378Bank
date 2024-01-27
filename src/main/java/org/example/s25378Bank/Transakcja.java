package org.example.s25378Bank;

public class Transakcja {
    public Transakcja(double wartoscPo,StatusTransakcji status) {
        this.status=status;
        this.wartoscPo=wartoscPo;
    }

    public void setStatus(StatusTransakcji status) {
        this.status = status;
    }

    private double wartoscPo;

    public void setWartoscPo(double wartoscPo) {
        this.wartoscPo = wartoscPo;
    }

    private StatusTransakcji status;
}
