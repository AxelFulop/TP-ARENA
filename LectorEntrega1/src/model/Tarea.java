package model;

import java.util.ArrayList;
import java.util.List;

import org.uqbar.commons.utils.Observable;

@Observable
public class Tarea {

	private String nombre;
	private String estado;
	private List<Nota> notas = new ArrayList<Nota>();
	


	public String getEstado() {
		validarEstado();
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;

	}

	public List<Nota> getNotas() {
		return notas;
	}
	
	public void calificar(Nota nota)
	{
	notas.add(nota);
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}

	protected Tarea(String nom) {
		nombre = nom;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void  validarEstado() {
	
	 if(this.notas.get(notas.size() - 1).aprobada())
	 {
	  setEstado("Aprobado");
	 }
	 else
	 {
	 setEstado("No Aprobado"); 
	 }
	}
	
	
	public String getUltimaNota() {
		if(this.notas.isEmpty())
		{
		throw new RuntimeException("No hay notas cargadas");
		}
		else
		{
		return  this.notas.get(notas.size() - 1).valor();
		}
	}
	
	
	
	
}
