package com.tienda.models;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="clientes")
public class clientesModel implements Serializable {
	
	
	
	private static final long serialVersionUID = -1515420267441389548L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@OneToMany(mappedBy = "ClientesModel")
	private List<reservasModel> ReservasModel;
    

	@Column(name = "nombre" , nullable = false , length = 10)
    private String nombre;
    
    @Column(name = "apellido" , nullable = false , length = 10)
    private String apellido;
    
    @Column(name = "cedula" , nullable = false , length = 10)
    private String cedula;
    
    @Column(name = "direccion" , nullable = false , length = 10)
    private String direccion;
    
    @Column(name = "celular" , nullable = false , length = 10)
    private String celular;
    
    @Column(name = "correo" , nullable = false , length = 50)
    private String correo;
    
    @Column(name = "rol" , nullable = false , length = 10)
    private String rol;
    
    @Column(name = "contrasena" , nullable = false , length = 50)
    private String contrasena;

	@Override
	public String toString() {
		return "clientesModel [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", direccion=" + direccion + ", celular=" + celular + ", correo=" + correo + ", rol=" + rol
				+ ", contrasena=" + contrasena + "]";
	}
	
	

	public clientesModel() {
		super();
	}



	public clientesModel(Long id, String nombre, String apellido, String cedula, String direccion, String celular,
			String correo, String rol, String contrasena) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.direccion = direccion;
		this.celular = celular;
		this.correo = correo;
		this.rol = rol;
		this.contrasena = contrasena;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getCedula() {
		return cedula;
	}



	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getCelular() {
		return celular;
	}



	public void setCelular(String celular) {
		this.celular = celular;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public String getRol() {
		return rol;
	}



	public void setRol(String rol) {
		this.rol = rol;
	}



	public String getContrasena() {
		return contrasena;
	}



	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
    
    
	

	
    
   

	
	
}
