package Kodlama.o.Devs.busıness.concretes;

import Kodlama.o.Devs.busıness.abstracts.LanguegeService;
import Kodlama.o.Devs.dataAccess.abstracts.LanguegeRepository;
import Kodlama.o.Devs.entıtıes.concretes.Languege;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LanguegeManager implements LanguegeService {
    private LanguegeRepository languegeRepository;

    public LanguegeManager(LanguegeRepository languegeRepository) {
        this.languegeRepository = languegeRepository;
    }

    @Override
      public void add(Languege languege) throws Exception {
        if (this.isValid(languege)) {
            this.languegeRepository.add(languege);
        }
    }
    @Override
    public void update(int id,Languege languege) throws Exception {
            if(!isIdExist(id)){
                throw new Exception("id bulunamadi");
            }
             if(this.isValid(languege)){
         this.languegeRepository.update(languege,id);
      }
         }


        @Override
          public void delete(int id) throws Exception   {
                if(!isIdExist(id)){
                    throw new Exception("id bulunamadi");
            }
            this.languegeRepository.delete(id);

    }

    @Override
    public List<Languege> getAll() {
        return this.languegeRepository.getAll();
    }

    @Override
    public Languege getById(int id) {
        return this.languegeRepository.getById(id);
    }

    private boolean isNameEmpty(Languege languege){
        if(languege.getName().isEmpty()){
            return true;
        }
        return false;
    }
    private boolean isNameRepeat(Languege languege){
        List<Languege> langueges=getAll();
        for(Languege lang:langueges){
            if(languege.getName().equalsIgnoreCase(lang.getName())){
                return true;
            }
        }
        return false;
    }
    private boolean isValid(Languege languege)throws Exception{
        if(isNameEmpty(languege)){
            throw new Exception("Programlama dil ismi yazilmadan olusturulamaz!");
        }
        if(isNameRepeat(languege)){
            throw new Exception(languege.getName()+" isminde bir programla dili zaten var baska bir isimde dil ismi giriniz!");
}
        return true;
    }
    private boolean isIdExist (int id )throws Exception{
        for (Languege lang:getAll()){
            if(lang.getId()==id){
                return true;
            }
        }
        return false;

    }

        }



