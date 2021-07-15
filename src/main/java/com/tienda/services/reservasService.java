package com.tienda.services;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tienda.models.reservasModel;
import com.tienda.repositories.reservasRepository;

@Service
public class reservasService {

	@Autowired
	reservasRepository ReservasRepository;
	
	
	public ArrayList<reservasModel> obtenerReservas(){
		return (ArrayList<reservasModel>) ReservasRepository.findAll();
	}
	
	public reservasModel crearReserva(reservasModel reserva) {
		return ReservasRepository.save(reserva);
	}
	
	public Optional<reservasModel> obtenerPorId(Long id){
		   return ReservasRepository.findById(id);
	}
	
	
	public boolean eliminarReserva(Long id) {
		try {
		   ReservasRepository.deleteById(id);
		   return true;
		} catch (Exception e) {
			return false;
		}
	} 
	
	
}
