package Kodlama.o.Devs.dataAccess.abstracts;

import Kodlama.o.Devs.entıtıes.concretes.Languege;

import java.util.List;

public interface LanguegeRepository {
    void add(Languege languege);
    void update(Languege languege,int id);
    void delete(int id);
    List<Languege> getAll();
    Languege getById(int id);

}
