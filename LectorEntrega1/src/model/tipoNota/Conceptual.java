package model.tipoNota;

import model.Nota;

public class Conceptual implements Nota {
	EnumConceptual nota;

	public EnumConceptual getNota() {
		return nota;
	}

	public void setNota(EnumConceptual nota) {
		this.nota = nota;
	}

	public Conceptual(EnumConceptual not) {
	this.nota = not;
	}

	@Override
	public boolean aprobada() {

		return nota != EnumConceptual.MAL;
	}

	@Override
	public String valor() {
		
		return nota.name().toString();
	}



}
