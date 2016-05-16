package viruss.plugin.parts;

import javax.annotation.PostConstruct;
import org.eclipse.swt.widgets.Composite;

import viruss.plugin.helper.TechnicalHelper;

public class ParametersPart {

	public ParametersPart() {
		TechnicalHelper.printClassName(this.getClass(), "Constructor");
	}
	
	@PostConstruct
	public void createControls(Composite parent) {
		TechnicalHelper.printClassName(this.getClass(), "@PostConstruct");
	}
	
}
