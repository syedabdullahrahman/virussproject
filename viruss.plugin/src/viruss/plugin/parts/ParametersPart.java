package viruss.plugin.parts;

import javax.annotation.PostConstruct;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import viruss.plugin.helper.TechnicalHelper;

public class ParametersPart {

	public ParametersPart() {
		TechnicalHelper.printClassName(this.getClass(), "Constructor");
	}
	
	@PostConstruct
	public void createControls(Composite parent) {
		TechnicalHelper.printClassName(this.getClass(), "@PostConstruct");
		
		final Composite comp = new Composite(parent, SWT.NONE);
	    
		comp.setLayout(new GridLayout(6,true));
	    
	    for(int i = 0; i<20; i++){
	    	Text text = new Text(comp, SWT.SEARCH | SWT.ICON_SEARCH | SWT.CANCEL | SWT.BORDER);
	    	text.setMessage("text box " + i);
		    //GridDataFactory.fillDefaults().hint(130, SWT.DEFAULT).applyTo(text);
	    }
	    
	    
		
	}
	
}
