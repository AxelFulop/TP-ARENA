package model;

import java.util.ArrayList;
import java.util.List;

import model.Repositories.AsignacionesRepository;

import org.uqbar.commons.model.Entity;
import org.uqbar.commons.utils.Observable;
import org.uqbar.commons.utils.Transactional;

@SuppressWarnings("serial")
@Transactional
@Observable
public class Alumno extends Entity {

	private String nombre;
	private int legajo;
	private String apellido;
	private String userGit;
	private List<Asignacion> asignaciones = new ArrayList<>();

	public Alumno(String unNom, String ape, int leg, String userGit) {
		this.nombre = unNom;
		this.apellido = ape;
		this.legajo = leg;
		this.userGit = userGit;
		this.asignaciones = getAsignaciones();
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getuserGit() {
		return userGit;
	}

	public void setuserGit(String userGit) {
		this.userGit = userGit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo2) {
		this.legajo = legajo2;
	}

	public void agregarAsignacion(Asignacion unaAsig) {
		AsignacionesRepository.getInstance().agregar(unaAsig);
	}
	
	public void limpiarAsignaciones()
	{
   this.asignaciones.removeAll(getAsignaciones());
	}


	public List<Asignacion> getAsignaciones() {
		return AsignacionesRepository.getInstance().all();
	}

	public boolean mismoLegajo(int unLeg) {

		return this.getLegajo() == unLeg;
	}

}
