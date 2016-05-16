package viruss.plugin.parts;

import javax.annotation.PostConstruct;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;


public class MainPart {
	Display display;
	public MainPart(){
		display = Display.getCurrent();
		System.out.println("Main part constructor");
	}
	
	@PostConstruct
	public void createControls(Composite parent) {
		// set part layout
		final Composite comp = new Composite(parent, SWT.NONE);
	    comp.setLayout(new GridLayout());
	  
	    // create Text control
	    Text text = new Text(comp, SWT.SEARCH | SWT.ICON_SEARCH | SWT.CANCEL
	        | SWT.BORDER);
	    text.setMessage("Search");
	   
	    // add to layout
	    GridDataFactory.fillDefaults().hint(130, SWT.DEFAULT).applyTo(text);
	  
	    System.out.println(this.getClass().getSimpleName()
				+ " @PostConstruct method called.");
	    
	} 


	 
	

	
}
