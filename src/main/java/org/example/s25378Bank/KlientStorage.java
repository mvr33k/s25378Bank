package org.example.s25378Bank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class KlientStorage {

    private List<Klient> klientList = new ArrayList<>();

    public void add(Klient klient) {
        klientList.add(klient);
    }

    public Optional<Klient> findById(Integer id) {
        return getAll().stream()
                .filter(klient -> klient.getId().equals(id))
                .findFirst();
    }

    private List<Klient> getAll() {
        return klientList;
    }

    public void purgeList() {
        klientList.clear();
    }
}
