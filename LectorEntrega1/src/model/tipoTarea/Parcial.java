package model.tipoTarea;

import model.Tarea;
import model.tipoNota.Numerica;

import org.uqbar.commons.utils.Observable;

@Observable
public class Parcial extends Tarea {
	Numerica calificacion;

	public Numerica getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Numerica calificacion) {
		this.calificacion = calificacion;
	}

	public Parcial(String nom) {
		super(nom);
		
	}

}
