package viruss.plugin.parts;

import javax.annotation.PostConstruct;
import org.eclipse.swt.widgets.Composite;


public class MainPart {

	public MainPart(){
		System.out.println("main part constructor");
	}
	
	@PostConstruct
	public void createControls(Composite parent) {
	  System.out.println(this.getClass().getSimpleName()
	  + " @PostConstruct method called.");
	} 


	
}
