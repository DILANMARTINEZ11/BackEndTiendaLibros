package com.tienda.models;


import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="reservas")
public class reservasModel implements Serializable {

	
	
	private static final long serialVersionUID = 2099883655467548995L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne()
	@JoinColumn(name = "cliente_id" , nullable = false)
	private clientesModel ClientesModel;
	
	@ManyToOne()
	@JoinColumn(name = "libro_id", nullable = false)
	private librosModel LibrosModel;
	
	
	@Column(name = "fechaAlquiler" , nullable = false)
	private java.sql.Date fechaAlquiler;
	
	@Column(name = "fechaDevolucion" , nullable = false)
	private java.sql.Date fechaDevolucion;
	
	@Column(name = "tarifaTotal" , nullable = false)
	private Double tarifaTotal;
	
	

	@Override
	public String toString() {
		return "reservasModel [id=" + id + ", ClientesModel=" + ClientesModel + ", LibrosModel=" + LibrosModel
				+ ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", tarifaTotal="
				+ tarifaTotal + "]";
	}

	public reservasModel() {
		super();
	}

	public reservasModel(Long id, clientesModel clientesModel, librosModel librosModel, Date fechaAlquiler,
			Date fechaDevolucion, Double tarifaTotal) {
		super();
		this.id = id;
		ClientesModel = clientesModel;
		LibrosModel = librosModel;
		this.fechaAlquiler = fechaAlquiler;
		this.fechaDevolucion = fechaDevolucion;
		this.tarifaTotal = tarifaTotal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public clientesModel getClientesModel() {
		return ClientesModel;
	}

	public void setClientesModel(clientesModel clientesModel) {
		ClientesModel = clientesModel;
	}

	public librosModel getLibrosModel() {
		return LibrosModel;
	}

	public void setLibrosModel(librosModel librosModel) {
		LibrosModel = librosModel;
	}

	public java.sql.Date getFechaAlquiler() {
		return fechaAlquiler;
	}

	public void setFechaAlquiler(java.sql.Date fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}

	public java.sql.Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(java.sql.Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public Double getTarifaTotal() {
		return tarifaTotal;
	}

	public void setTarifaTotal(Double tarifaTotal) {
		this.tarifaTotal = tarifaTotal;
	}
	
	

	
	
	
	
}
