package Kodlama.o.Devs.webApı;

import Kodlama.o.Devs.busıness.abstracts.LanguegeService;
import Kodlama.o.Devs.entıtıes.concretes.Languege;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/langueges")
public class LanguegesController {
    private LanguegeService languegeService;

    public LanguegesController(LanguegeService languegeService) {
        this.languegeService = languegeService;
    }
    @GetMapping
    public List<Languege>getAll(){
        return this.languegeService.getAll();

    }
    @GetMapping("/{id}")
        public Languege getById(@PathVariable int id)throws Exception{

            return this.languegeService.getById(id);
        }
        @PostMapping
     public void add(@RequestBody Languege languege ) throws Exception{
     this.languegeService.add(languege);

        }
        @DeleteMapping ("/{id}")
    public void delete( @PathVariable int id)throws Exception{
        this.languegeService.delete(id);
        }
        @PutMapping ("/{id}")
    public void update(@PathVariable int id,@RequestBody Languege languege)throws Exception{
        this.languegeService.update(id,languege);

    }

}
