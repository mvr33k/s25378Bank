package org.example.s25378Bank;

import org.springframework.stereotype.Service;

@Service
public class TransakcjaService {



    KlientStorage klientStorage= new KlientStorage();

    public Transakcja zlecPrzelew(int id, double wartosc) {
        Klient klient = klientStorage.findById(id).orElseThrow();
//        try {
//            System.out.println("Brak klienta w bazie");
//        } finally {
//        }

        Transakcja transakcja = new Transakcja(klient.getSaldo(), StatusTransakcji.DECLINED);
        if (klient.getSaldo() >= wartosc) {
            klient.setSaldo(klient.getSaldo() - wartosc);
            transakcja.setStatus(StatusTransakcji.ACCEPTED);
            transakcja.setWartoscPo(klient.getSaldo());
        } else throw new RuntimeException("Saldo na koncie za niskie");
        return transakcja;
    }

    public Transakcja wplacPieniadze(int id, double wartosc) {
        Klient klient = klientStorage.findById(id).orElseThrow();
//        try {
//            System.out.println("Brak klienta w bazie");
//        } finally {
//        }
        Transakcja transakcja = new Transakcja(klient.getSaldo(), StatusTransakcji.ACCEPTED);
        klient.setSaldo(klient.getSaldo() + wartosc);
        transakcja.setStatus(StatusTransakcji.ACCEPTED);
        transakcja.setWartoscPo(klient.getSaldo());
        return transakcja;
    }


}
