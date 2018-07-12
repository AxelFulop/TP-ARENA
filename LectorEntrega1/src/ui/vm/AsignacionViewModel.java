package ui.vm;

import java.util.List;

import model.Alumno;
import model.Asignacion;
import model.Nota;
import model.Tarea;


import org.uqbar.commons.utils.Observable;

@Observable
public class AsignacionViewModel {

	private int legajo;
	private List<Asignacion> asignaciones;
	private Asignacion asignacion;
	private List<Tarea> tareas;
	private Tarea tarea;

	public AsignacionViewModel(Alumno alumno) {
		this.legajo = alumno.getLegajo();
		this.asignaciones = alumno.getAsignaciones();

	}

	public Tarea getTarea() {
		return tarea;
	}

	public void setTarea(Tarea tarea) {
		this.tarea = tarea;
	}


	public List<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(List<Tarea> tareas) {
		this.tareas = tareas;
	}

	public Asignacion getAsignacion() {
		return asignacion;
	}

	public void setAsignacion(Asignacion asignacion) {
		this.asignacion = asignacion;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public List<Asignacion> getAsignaciones() {
		return asignaciones;
	}

	public void setAsignaciones(List<Asignacion> asignaciones) {
		this.asignaciones = asignaciones;
	}

}
