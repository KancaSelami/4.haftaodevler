package kodlama.io.rentACar.Business.concretes;

import kodlama.io.rentACar.Business.abstracts.BrandService;

import java.util.List;

import kodlama.io.rentACar.DataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.Entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // bu sinif bir business nesnesidir
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;
@Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll(){
// iskurallari.


        return brandRepository.getAll();
    }
}
