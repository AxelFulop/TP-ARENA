package model.tipoNota;

import model.Nota;

public class Numerica implements Nota {

	private double nota;

	public Numerica(int i) {
		this.nota = i;
	}

	public double getValor() {
		return nota;
	}

	public void setValor(double valorNota) {
		this.nota = valorNota;
	}

	@Override
	public boolean aprobada() {

		return nota >= 6;
	}

	@Override
	public String valor() {
		return Double.toString(this.nota);
	}




}
