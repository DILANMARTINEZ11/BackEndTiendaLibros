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

import com.tienda.models.librosModel;
import com.tienda.services.librosService;

@RestController
@CrossOrigin(origins = "*" , methods = {RequestMethod.GET , RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("/libros")
public class librosController {
	@Autowired
	librosService LibrosService;

	@GetMapping()
	public ArrayList<librosModel> obtenerLibros() {
		return LibrosService.obtenerlibros();
	}

	@PostMapping()
	public librosModel registrarCliente(@RequestBody librosModel libro) {
		return this.LibrosService.crearLibro(libro);
	}

	@GetMapping(path = "/{id}")
	public Optional<librosModel> obtenerPorId(@PathVariable("id") Long id) {
		return this.LibrosService.obtenerPorId(id);
	}

	@DeleteMapping(path = "/{id}")
	public String eliminarPorId(@PathVariable("id") Long id) {
		boolean ok = this.LibrosService.eliminarLibro(id);
		if (ok) {
			return "Se elimino el Libro " + id;
		} else {
			return "No se elimino el Libro " + id;
		}
	}

}
