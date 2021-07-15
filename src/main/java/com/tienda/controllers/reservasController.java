package com.tienda.controllers;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.tienda.models.reservasModel;
import com.tienda.services.reservasService;

@RestController
@CrossOrigin(origins = "*" , methods = {RequestMethod.GET , RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("/reservas")
public class reservasController {
	@Autowired
	reservasService ReservasService;

	@GetMapping()
	public ArrayList<reservasModel> obtenerClientes() {
		return ReservasService.obtenerReservas();
	}

	@PostMapping()
	public reservasModel registrarReserva(@RequestBody reservasModel reserva) {
		return this.ReservasService.crearReserva(reserva);
	}

	@GetMapping(path = "/{id}")
	public Optional<reservasModel> obtenerPorId(@PathVariable("id") Long id) {
		return this.ReservasService.obtenerPorId(id);
	}

	@DeleteMapping(path = "/{id}")
	public String eliminarPorId(@PathVariable("id") Long id) {
		boolean ok = this.ReservasService.eliminarReserva(id);
		if (ok) {
			return "Se elimino la reserva" + id;
		} else {
			return "No se elimino la reserva" + id;
		}
	}

}
