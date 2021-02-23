package PRACTICA3_AD.NeoDatis;

public class AsigProf {
	
	String nombre;
	String descripcion;
	
	
	
	
	public AsigProf(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	public AsigProf() {
		
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

	@Override
	public String toString() {
		return "AsigProf [nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	
	

	

}
