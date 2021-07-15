package com.tienda.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tienda.models.librosModel;

@Repository
public interface librosRepository extends CrudRepository<librosModel, Long> {

}
