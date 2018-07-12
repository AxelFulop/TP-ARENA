package model;


import java.util.List;

import org.uqbar.commons.utils.Observable;

@Observable
public class Asignacion {

	private String nombre;
	private List<Tarea> tareas;

	public Asignacion(List<Tarea> tareas, String nombre) {
		this.nombre = nombre;
		this.tareas = tareas;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Tarea> getTareas() {
		return tareas;
	}

}