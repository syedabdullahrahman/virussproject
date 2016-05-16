package viruss.plugin.parts;

import javax.annotation.PostConstruct;
import org.eclipse.swt.widgets.Composite;

import viruss.plugin.helper.Helper;

public class ParametersPart {

	public ParametersPart() {
		Helper.printClassName(this.getClass(), "Constructor");
	}
	
	@PostConstruct
	public void createControls(Composite parent) {
		Helper.printClassName(this.getClass(), "@PostConstruct");
	}
	
}
