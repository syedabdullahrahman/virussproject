package viruss.plugin.parts;

import javax.annotation.PostConstruct;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;

import viruss.plugin.helper.Helper;


public class ControlsPart {
	Display display;
	public ControlsPart(){
		Helper.printClassName(this.getClass(), "Constructor");
		display = Display.getCurrent();
		
	}
	
	@PostConstruct
	public void createControls(Composite parent) {
		Helper.printClassName(this.getClass(), "@PostConstruct");
		// set part layout
		final Composite comp = new Composite(parent, SWT.NONE);
	    comp.setLayout(new GridLayout());
	  
	    // create Text control
	    Text text = new Text(comp, SWT.SEARCH | SWT.ICON_SEARCH | SWT.CANCEL
	        | SWT.BORDER);
	    text.setMessage("Search");
	   
	    // add to layout
	    GridDataFactory.fillDefaults().hint(130, SWT.DEFAULT).applyTo(text);
	  

	} 


	 
	

	
}
