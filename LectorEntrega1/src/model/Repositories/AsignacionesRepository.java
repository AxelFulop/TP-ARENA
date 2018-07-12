package model.Repositories;

import java.util.LinkedList;
import java.util.List;

import model.Alumno;
import model.Asignacion;

public class AsignacionesRepository {

	private static AsignacionesRepository instance;
	private List<Asignacion> asignaciones = new LinkedList<Asignacion>();

	public static AsignacionesRepository getInstance() {
		if (instance == null) {
			instance = new AsignacionesRepository();
		}
		return instance;
	}

	public void agregar(Asignacion asignacion) {
		this.asignaciones.add(asignacion);
	}

	public List<Asignacion> all() {
		return asignaciones;
	}

	

	
}
