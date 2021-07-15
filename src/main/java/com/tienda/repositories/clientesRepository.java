package com.tienda.repositories;

import java.util.ArrayList;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.tienda.models.clientesModel;

@Repository
public interface clientesRepository extends CrudRepository<clientesModel, Long> {

	public abstract ArrayList<clientesModel> findByNombre(String nombre);
	
	
	
	
	
	
	
}
