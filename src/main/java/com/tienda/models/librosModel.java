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
@Table(name="libros")
public class librosModel implements Serializable {
	

	
	private static final long serialVersionUID = -4175947223874208704L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(mappedBy = "LibrosModel")
	private List<reservasModel> ReservasModel;
	
	@Column(name = "nombre" , nullable = false)
	private String nombre;
	
	@Column(name = "descripcion" , nullable = false)
	private String descripcion;
	
	@Column(name = "cantidad" , nullable = false)
	private Integer  cantidad;
	
	@Column(name = "tarifa" , nullable = false)
	private Double tarifa;

	@Override
	public String toString() {
		return "librosModel [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", cantidad="
				+ cantidad + ", tarifa=" + tarifa + "]";
	}
	
	

	public librosModel() {
		super();
	}



	public librosModel(Long id, String nombre, String descripcion, Integer cantidad, Double tarifa) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.tarifa = tarifa;
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



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public Integer getCantidad() {
		return cantidad;
	}



	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}



	public Double getTarifa() {
		return tarifa;
	}



	public void setTarifa(Double tarifa) {
		this.tarifa = tarifa;
	}
	
	

	
	
	
	
	
	
	
	

}
