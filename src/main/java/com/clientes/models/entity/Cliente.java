package com.clientes.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
//import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="clientes")
public class Cliente implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty(message = "No puede estar vacio")
	@Size(min=4, max=12, message = "El tamaño tiene que estar entre 4 y 12")
	@Column(nullable=false)
	private String nombre;
	
	@NotEmpty(message = "No puede estar vacio")
	private String apellido;
	
	@NotEmpty(message = "No puede estar vacio")
	@Email(message = "Formato de correo erroneo")
	@Column(nullable=false, unique=true)
	private String email;
	
	@NotNull(message = "No puede estar vacio")
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	private String imagen;
	
	@NotNull(message="No puede estar vacio")
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="region_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private Region region;
	
	@JsonIgnoreProperties(value={"cliente","hibernateLazyInitializer","handler"}, allowSetters=true)
	@OneToMany(fetch=FetchType.LAZY, mappedBy="cliente", cascade=CascadeType.ALL)
	private List<Factura> facturas;
	
	public Cliente() {
		super();
		this.facturas = new ArrayList<>();
	}	
	
	public Cliente(Integer id, String nombre, String apellido, String email, Date fecha, String imagen) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.fecha = fecha;
		this.imagen = imagen;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}
	
	public List<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}
	
	/*@PrePersist
	public void prePersist() {
		fecha = new Date();
	}*/	

	@Override
	public String toString() {
		return "Cliente => [id=" + this.id + ", nombre=" + this.nombre + ", apellido=" + this.apellido + ", email=" + this.email + ", fecha="
				+ this.fecha + ", imagen=" + this.imagen + "]";
	}
}
