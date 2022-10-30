package Kodlama.o.Devs.dataAccess.concretes;

import Kodlama.o.Devs.dataAccess.abstracts.LanguegeRepository;
import Kodlama.o.Devs.entıtıes.concretes.Languege;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguegeRepository implements LanguegeRepository {

    private List<Languege>langueges;

    public InMemoryLanguegeRepository() {

        langueges=new ArrayList<>();
         langueges.add(new Languege(1,"C#"));
         langueges.add(new Languege(2,"Java"));
         langueges.add(new Languege(3,"Html"));
         langueges.add(new Languege(4,"C++"));


    }

    @Override
    public void add(Languege languege) {
        this.langueges.add(languege);

    }

    @Override
    public void update(Languege languege,int id) {
    Languege lang=this.findLanguege(id);
    lang.setName(languege.getName());

    }

    @Override
    public void delete(int id) {
    Languege lang=this.findLanguege(id);
    langueges.remove(lang);
    }

    @Override
    public List<Languege> getAll() {

        return this.langueges;
    }

    @Override
    public Languege getById(int id) {
        for(Languege lang :getAll()){
            if(lang.getId()==id){

                return lang;

            }

        }return null;


    }
    private Languege findLanguege(int id){
        Languege lang=null;
        for(Languege languege:langueges){
            if(languege.getId()==id){
                lang=languege;
                break;
            }
        }
   return lang;

    }
}
