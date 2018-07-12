package ui.windows;

import model.Alumno;
import model.Asignacion;
import model.Nota;
import model.Tarea;
import model.Repositories.AsignacionesRepository;

import org.apache.commons.collections15.Transformer;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import ui.vm.AsignacionViewModel;

@SuppressWarnings("serial")
public class EstadoAlumnoWindow extends Dialog<AsignacionViewModel> {
	public EstadoAlumnoWindow(WindowOwner owner, Alumno alu) {
		super(owner, new AsignacionViewModel(alu));

	}

	@Override
	protected void addActions(Panel panelActions) {
		new Button(panelActions).setCaption("Cancelar").onClick(this::cancel)
				.setWidth(100);

	}

	@Override
	protected void createFormPanel(Panel formPanel) {
		String leg = Integer.toString(getModelObject().getLegajo());
		this.setTitle("Estado del Alumno con leg  " + leg);

		new Label(formPanel).setText("Asignaciones");

		Selector<Asignacion> listasignaciones = new Selector<Asignacion>(
				formPanel);
		listasignaciones.bindItemsToProperty("asignaciones").adaptWith(
				Asignacion.class, "nombre");
		listasignaciones.bindValueToProperty("asignacion");

		new Label(formPanel).setText("Tareas");
		Selector<Tarea> selectorPrenda = new Selector<Tarea>(formPanel)
				.allowNull(true);
		selectorPrenda.bindItemsToProperty("asignacion.tareas").adaptWith(
				Tarea.class, "nombre");
		selectorPrenda.bindValueToProperty("tarea");

		new Label(formPanel).setText("Ultima Nota");
		new TextBox(formPanel).bindValueToProperty("tarea.ultimaNota");

		new Label(formPanel).setText("Estado");
		new TextBox(formPanel).bindValueToProperty("tarea.estado");

	}

	// public void obtenerDatos() {
	// Dialog<?> dialog =
	// dialog.open();
	// dialog.onAccept(() -> {});
	// }

}
