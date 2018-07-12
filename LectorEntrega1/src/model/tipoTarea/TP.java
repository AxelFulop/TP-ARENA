package model.tipoTarea;

import org.uqbar.commons.utils.Observable;

import model.Tarea;
import model.tipoNota.EnumConceptual;

@Observable
public class TP extends Tarea {
	EnumConceptual calificacion;

	public EnumConceptual getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(EnumConceptual calificacion) {
		this.calificacion = calificacion;
	}

	public TP(String nom) {
		super(nom);
		

	}

}
