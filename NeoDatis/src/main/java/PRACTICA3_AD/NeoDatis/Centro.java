package PRACTICA3_AD.NeoDatis;

import java.util.List;

public class Centro {
	
	int codigo;
	String nombre;
	int director;
	String direccion;
	String localidad;
	String porvincia;
	List<Profesor>misProfes;
	


	public Centro(int codigo, String nombre, int director, String direccion, String localidad, String porvincia,
			List<Profesor> misProfes) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.director = director;
		this.direccion = direccion;
		this.localidad = localidad;
		this.porvincia = porvincia;
		this.misProfes = misProfes;
	}

	public Centro() {
	
	}
	
	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getDirector() {
		return director;
	}


	public void setDirector(int director) {
		this.director = director;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public String getPorvincia() {
		return porvincia;
	}


	public void setPorvincia(String porvincia) {
		this.porvincia = porvincia;
	}

	@Override
	public String toString() {
		return "Centro [codigo=" + codigo + ", nombre=" + nombre + ", director=" + director + ", direccion=" + direccion
				+ ", localidad=" + localidad + ", porvincia=" + porvincia + ", misProfes=" + misProfes + "]";
	}


	
	
	
	

	
	
	
	
}
