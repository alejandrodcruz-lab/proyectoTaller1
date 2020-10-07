package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// para que lo reconozca como entidad
@Entity
// indica como lo quiero guardar en la BD, en este caso como una tabla
// lo guarda en una tabla llamada CATEGORIA
@Table(name = "CATEGORIA")
public class Categoria {

	@Id
	@Column(name = "ID_CATEGORIA")
	private Integer idCategoria;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "DESCRIPCION")
	private String descripcion;

	public Categoria(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
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

}