package com.tienda.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.models.librosModel;
import com.tienda.repositories.librosRepository;

@Service
public class librosService {
	@Autowired
	librosRepository LibrosRepository;
	
	public ArrayList<librosModel> obtenerlibros(){
		return (ArrayList<librosModel>) LibrosRepository.findAll();
	}
	
	public librosModel crearLibro(librosModel libro) {
		return LibrosRepository.save(libro);
	}
	
	public Optional<librosModel> obtenerPorId ( Long id) {
		return LibrosRepository.findById(id);
	}
	
	public boolean eliminarLibro(Long id) {
		try {
		   LibrosRepository.deleteById(id);
		   return true;
		} catch (Exception e) {
			return false;
		}
	} 
	
}
