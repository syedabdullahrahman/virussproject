package viruss.plugin.parts;

import javax.annotation.PostConstruct;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;


import viruss.plugin.helper.TechnicalHelper;

public class ParametersPart {

	public ParametersPart() {
		TechnicalHelper.printClassName(this.getClass(), "Constructor");
	}
	
	@PostConstruct
	public void createControls(Composite parent) {
		TechnicalHelper.printClassName(this.getClass(), "@PostConstruct");
		
		final Composite comp = new Composite(parent, SWT.NONE);
		comp.setLayout(new FillLayout());
	    
		Group group1 = new Group(comp, SWT.NONE);
		group1.setLayout(new GridLayout(2,true));
		group1.setText("parameters");
		
		Group group2 = new Group(comp, SWT.NONE);
		group2.setLayout(new RowLayout());
		group2.setText("buttons");
		
	    for(int i = 0; i<5; i++){
	    	Label label = new Label(group1, SWT.BORDER);
	    	label.setText("label " + i);
	    	Text text = new Text(group1, SWT.SEARCH | SWT.ICON_SEARCH | SWT.CANCEL | SWT.BORDER);
	    	text.setMessage("text box " + i);
		    
	    	Button button = new Button(group2,SWT.NONE);
	    	button.setText("Button" + i);
	    	
	    	//GridDataFactory.fillDefaults().hint(130, SWT.DEFAULT).applyTo(text);
		    //GridDataFactory.fillDefaults().hint(130, SWT.DEFAULT).applyTo(label);
		    
	    }
		
	}
	
}
