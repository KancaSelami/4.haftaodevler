package kodlama.io.rentACar.Business.abstracts;

import kodlama.io.rentACar.Entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> getAll();
}
