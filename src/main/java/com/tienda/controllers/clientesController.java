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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.models.clientesModel;
import com.tienda.services.clientesService;

@RestController
@CrossOrigin(origins = "*" , methods = {RequestMethod.GET , RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("/clientes")
public class clientesController {
   @Autowired
   clientesService ClientesService;
   
   @GetMapping()
   public ArrayList<clientesModel> obtenerClientes(){
	   return ClientesService.obtenerClientes();
   }
   
   
   @PostMapping()
   public clientesModel registrarCliente(@RequestBody clientesModel cliente) {
	   return this.ClientesService.registrarCliente(cliente);
   }
   
   @GetMapping( path = "/{id}" )
   public Optional<clientesModel> obtenerPorId(@PathVariable("id") Long id){
	   return this.ClientesService.obtenerPorId(id);
   }
   
   @GetMapping("/search")
   public ArrayList<clientesModel> obtenerPorNombre(@RequestParam("nombre") String nombre){
	   return this.ClientesService.obtenerPorNombre(nombre);
   }
   
   @DeleteMapping(path = "/{id}")
   public String eliminarPorId(@PathVariable("id") Long id) {
	   boolean ok = this.ClientesService.eliminarCliente(id);
	   if (ok) {
		return "Se elimino el cliente" + id;
	} else {
        return "No se elimino el cliente" + id;
	}
   }
   
   
}
