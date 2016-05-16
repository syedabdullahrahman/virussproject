package viruss.plugin.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import thread.ConsoleThread;
import viruss.plugin.helper.TechnicalHelper;


public class ControlsPart {
	Display display;
	public ControlsPart(){
		TechnicalHelper.printClassName(this.getClass(), "Constructor");
		display = Display.getCurrent();
	}
	
	@Inject
	@Optional
	public void receiveActivePart(@Named(IServiceConstants.ACTIVE_PART) MPart activePart) {
	  if (activePart != null) {
	    System.out.println("Active part changed " + activePart.getLabel());
	  }
	}
	
	
	@Inject
	@Optional
	public void receiveActiveShell(@Named(IServiceConstants.ACTIVE_SHELL) Shell activeShell) {
	  if (activeShell != null) {
	    System.out.println("Active shell changed " + activeShell.getText());
	  }
	}
	
	
	@PostConstruct
	public void createControls(Composite parent) {
		TechnicalHelper.printClassName(this.getClass(), "@PostConstruct");
		// set part layout
		final Composite comp = new Composite(parent, SWT.NONE);
	    comp.setLayout(new GridLayout());
	    
	    // create Text control
	    Text text = new Text(comp, SWT.SEARCH | SWT.ICON_SEARCH | SWT.CANCEL | SWT.BORDER);
	    text.setMessage("Search");
	
	    // add to layout
	    GridDataFactory.fillDefaults().hint(130, SWT.DEFAULT).applyTo(text);
	  
	    // add thread print button
	    Button button0 = new Button(comp, SWT.NONE);
	    button0.setText("Thread print");
	    button0.addListener(SWT.Selection, new Listener() {
	      public void handleEvent(Event e) {
	        switch (e.type) {
	        case SWT.Selection:
	          createConsoleThread();
	          break;
	        }
	      }
	    });
	    
	    // add get part button
	    Button button1 = new Button(comp, SWT.NONE);
	    button1.setText("get part");
	    button1.addListener(SWT.Selection, new Listener() {
	      public void handleEvent(Event e) {
	        switch (e.type) {
	        case SWT.Selection:
	        	getResultsPart();
	          break;
	        }
	      }
	    });
	    
	    GridDataFactory.fillDefaults().hint(130, SWT.DEFAULT).applyTo(button0);
	    GridDataFactory.fillDefaults().hint(130, SWT.DEFAULT).applyTo(button1);
	}
	
	private void createConsoleThread() {
		Thread thread = new Thread(new ConsoleThread());
		thread.start();
	}
	
	
	@Inject EPartService partService;
	@Inject MPart part;
	private void getResultsPart() {
		part = partService.findPart("viruss.plugin.part.results");
		System.out.println(part.getLabel() + ": " + part );
	}
}