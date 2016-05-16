package viruss.plugin.parts;

import viruss.plugin.helper.*;
import javax.annotation.PostConstruct;
import org.eclipse.swt.widgets.Composite;

public class ResultsPart {

	public ResultsPart() {
		Helper.printClassName(this.getClass(), "Constructor");
	}
	
	@PostConstruct
	public void createControls(Composite parent) {
		Helper.printClassName(this.getClass(), "@PostConstruct");
	}
	
}
