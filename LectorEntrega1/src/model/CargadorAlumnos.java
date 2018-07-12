package model;

import java.util.ArrayList;
import java.util.List;

import model.Repositories.AlumnosRepository;
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
        
		//Se agregan al repo
		 AlumnosRepository docente = new AlumnosRepository();
		 docente.getInstance().agregar(axel);
		 docente.getInstance().agregar(lucas);
		
		//cargo notas Numericas y parciales

		Parcial discretaParcial = new Parcial("primerParcial");
		discretaParcial.calificar(new Numerica(8));
	    Parcial ddsParcial = new Parcial("recup 1er parc");
	    ddsParcial.calificar(new Numerica(3));
		
		
		//cargo notas conceptuales
		TP discretaTp = new TP("Algebra Bool");
		discretaTp.calificar(new Conceptual(EnumConceptual.MAL));
		TP ddsTp = new TP("Entrega Arena");
		ddsTp.calificar((new Conceptual(EnumConceptual.BIEN)));
		
		//Creo la lista de tareas
		List<Tarea> tareasDiscreta = new ArrayList<Tarea>();
		tareasDiscreta.add(discretaParcial);
		tareasDiscreta.add(ddsParcial);
		tareasDiscreta.add(discretaTp); 
		tareasDiscreta.add(ddsTp);
		
		List<Tarea> tareasDDS = new ArrayList<Tarea>();
		tareasDDS.add(ddsParcial);
		tareasDDS.add(ddsTp);
		
		Asignacion MatDisc = new Asignacion(tareasDiscreta,"Mat Disc");
		Asignacion DDS = new Asignacion(tareasDDS ,"DDS");
		
		
		//
		axel.cursarAsignacion(MatDisc);
		axel.cursarAsignacion(DDS);
		
		lucas.cursarAsignacion(MatDisc);
		lucas.cursarAsignacion(DDS);
	
	}

}
