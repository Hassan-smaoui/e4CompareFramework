package de.tu_bs.cs.isf.e4cf.compare.data_structures;

import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import de.tu_bs.cs.isf.e4cf.compare.data_structures.compare.view.CompareEngineView;
import de.tu_bs.cs.isf.e4cf.core.util.ServiceContainer;
import javafx.embed.swt.FXCanvas;

public class CompareEngineController {
	private CompareEngineView view;
	
	@PostConstruct
	public void postConstruct(Composite parent, ServiceContainer services) {
		view = new CompareEngineView(new FXCanvas(parent, SWT.NONE), services);
	}
	
	

	

	
}