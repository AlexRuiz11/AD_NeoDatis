package PRACTICA3_AD.NeoDatis;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Profesor {
	
	
	int codigo;
	String nombre;
	String apellidos;
	String sexo;







	String   fechaNacimiento;
	List<Asignaruta>misAsignarutas;


	


	public Profesor(int codigo, String nombre, String apellidos, String sexo, String   fechaNacimiento,
			List<Asignaruta> misAsignarutas) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		this.misAsignarutas = misAsignarutas;
	}




	public Profesor() {
	
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

	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String   getFechaNacimiento() {
		return fechaNacimiento;
	}



	public void setFechaNacimiento(String   fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public List<Asignaruta> getMisAsignarutas() {
		return misAsignarutas;
	}




	public void setMisAsignarutas(List<Asignaruta> misAsignarutas) {
		this.misAsignarutas = misAsignarutas;
	}




	@Override
	public String toString() {
		return "Profesor [codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sexo=" + sexo
				+ ", fechaNacimiento=" + fechaNacimiento + ", misAsignarutas=" + misAsignarutas + "]";
	}





	
	
	

}
