package viruss.plugin.parts;

import viruss.plugin.helper.*;
import javax.annotation.PostConstruct;
import org.eclipse.swt.widgets.Composite;

public class ResultsPart {

	public ResultsPart() {
		TechnicalHelper.printClassName(this.getClass(), "Constructor");
	}
	
	@PostConstruct
	public void createControls(Composite parent) {
		TechnicalHelper.printClassName(this.getClass(), "@PostConstruct");
	}
	
	public void showResult(){
		System.out.println("result from ResultPart");
	}
	
	
}
