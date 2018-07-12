package model;

import java.util.ArrayList;
import java.util.List;

import model.Repositories.AlumnosRepository;
import model.Repositories.AsignacionesRepository;
import model.tipoNota.Conceptual;
import model.tipoNota.EnumConceptual;
import model.tipoNota.Numerica;
import model.tipoTarea.Parcial;
import model.tipoTarea.TP;

public class CargadorAlumnos {

	public static void initialize() {
		//cargo alumnos
		Alumno axel = new Alumno("Axel", "Fulop", 1526297, "AxelF");
		Alumno lucas = new Alumno("Lucas", "Mirabal", 1432228, "LucasM");

		AlumnosRepository docente = new AlumnosRepository();
		 docente.getInstance().agregar(axel);
		 docente.getInstance().agregar(lucas);
		
		//cargo notas Numericas y parciales

		Parcial discretaParcial = new Parcial("primerParcial");
		discretaParcial.calificar(new Numerica(8));
	    Parcial ddsParcial = new Parcial("recup 1er parc");
	    ddsParcial.calificar(new Numerica(3));
		
		
		//cargo notas conceptuales
		TP discretaTp = new TP("Entrega 0");
		discretaTp.calificar(new Conceptual(EnumConceptual.MAL));
		TP ddsTp = new TP("Entrega Arena");
		ddsTp.calificar((new Conceptual(EnumConceptual.BIEN)));
		
		List<Tarea> listaDiscreta = new ArrayList<Tarea>();
		listaDiscreta.add(discretaParcial);
		listaDiscreta.add(ddsParcial);
		listaDiscreta.add(discretaTp); 
		listaDiscreta.add(ddsTp);
		
		List<Tarea> listaPdeP = new ArrayList<Tarea>();
		listaPdeP.add(discretaParcial);
		listaPdeP.add(ddsTp);
		
		Asignacion MatDisc = new Asignacion(listaDiscreta,"Mat Disc");
		Asignacion PdeP = new Asignacion(listaPdeP,"PdeP");
		
		
		//
		axel.agregarAsignacion(MatDisc);
		axel.agregarAsignacion(PdeP);
		
		lucas.agregarAsignacion(MatDisc);
		lucas.agregarAsignacion(PdeP);
	
	}

}
