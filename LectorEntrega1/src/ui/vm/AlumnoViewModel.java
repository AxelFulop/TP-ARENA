package ui.vm;

import model.*;
import model.Repositories.AlumnosRepository;


import java.util.ArrayList;
import java.util.List;

import org.uqbar.commons.utils.Observable;

@Observable
public class AlumnoViewModel

{

	private Alumno alumno;
	private String nombre;
	private String apellido;
	private int legajo;
	private String gitUser;

	public AlumnoViewModel(Alumno unAlumno) {
		this.alumno = unAlumno;
		this.apellido = this.alumno.getApellido();
		this.legajo = alumno.getLegajo();
		this.gitUser = alumno.getuserGit();
		this.nombre = this.alumno.getNombre();

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

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getgitUser() {
		return gitUser;
	}

	public void setgitUser(String githubUser) {
		this.gitUser = githubUser;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
		
	}

	
	public Alumno getAlumno() {
		return alumno;
	}


}
