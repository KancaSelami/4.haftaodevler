package kodlama.io.rentACar.DataAccess.abstracts;

import kodlama.io.rentACar.Entities.concretes.Brand;


import java.util.List;

public interface BrandRepository {

    List<Brand> getAll();

}
