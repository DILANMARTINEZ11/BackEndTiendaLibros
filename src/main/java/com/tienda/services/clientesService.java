package com.tienda.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.models.clientesModel;
import com.tienda.repositories.clientesRepository;

@Service
public class clientesService {

	@Autowired
	clientesRepository ClientesRepository;
	
	public ArrayList<clientesModel> obtenerClientes(){
		return (ArrayList<clientesModel>) ClientesRepository.findAll();
	}
	
	
	
	public clientesModel registrarCliente(clientesModel cliente) {
		return ClientesRepository.save(cliente);
	}
	
	public Optional<clientesModel> obtenerPorId(Long id){
		   return ClientesRepository.findById(id);
	}
	
	public ArrayList<clientesModel> obtenerPorNombre(String nombre){
		   return ClientesRepository.findByNombre(nombre);
	}
	
	public boolean eliminarCliente(Long id) {
		try {
		   ClientesRepository.deleteById(id);
		   return true;
		} catch (Exception e) {
			return false;
		}
	} 
	   
	
}
