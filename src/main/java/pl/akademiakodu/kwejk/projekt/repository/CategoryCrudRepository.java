package pl.akademiakodu.kwejk.projekt.repository;

import org.springframework.data.repository.CrudRepository;
import pl.akademiakodu.kwejk.projekt.model.manytoone.ModelCategory;

/**
 * Created by arabk on 13.11.2017.
 */
public interface CategoryCrudRepository extends CrudRepository<ModelCategory, Long> {

    ModelCategory findByName(String name);
    ModelCategory findById(Long id);

}
