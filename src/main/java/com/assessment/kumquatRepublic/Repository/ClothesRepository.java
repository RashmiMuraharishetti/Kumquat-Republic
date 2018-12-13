package com.assessment.kumquatRepublic.Repository;

import com.assessment.kumquatRepublic.Entity.Clothes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClothesRepository extends CrudRepository<Clothes, Integer> {
}
