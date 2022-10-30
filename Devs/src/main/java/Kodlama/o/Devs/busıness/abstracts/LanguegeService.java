package Kodlama.o.Devs.busıness.abstracts;

import Kodlama.o.Devs.entıtıes.concretes.Languege;

import java.util.List;

public interface LanguegeService {
    void add(Languege languege)throws Exception;
    void update(int id,Languege languege)throws Exception;
    void delete(int id)throws Exception;
    List<Languege>getAll();
    Languege getById(int id)throws Exception;
}
