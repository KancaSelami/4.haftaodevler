package kodlama.io.rentACar.DataAccess.concretes;

import kodlama.io.rentACar.DataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.Entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository // bu sinif bir dataaccess  nesnesidir.
public class InMemoryBrantRepository implements BrandRepository {
    List<Brand> brands;

    public InMemoryBrantRepository() {
        brands=new ArrayList<Brand>();
        brands.add(new Brand(1,"bmw"));
        brands.add(new Brand(2,"mercedes"));
        brands.add(new Brand(3,"audi"));
        brands.add(new Brand(4,"fiat"));
        brands.add(new Brand(5,"renault"));



    }

    public List<Brand> getAll(){

    return brands;
}
}
