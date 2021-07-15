package com.tienda.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tienda.models.reservasModel;

@Repository
public interface reservasRepository extends CrudRepository<reservasModel, Long> {

	
}
