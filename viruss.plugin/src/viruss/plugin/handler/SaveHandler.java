package viruss.plugin.handler;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.CanExecute;
import javax.inject.Named;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.EPartService;



public class SaveHandler {
// 	org.eclipse.ui.file.save
	
	
	@Execute
	public void execute(
			@Named(IServiceConstants.ACTIVE_PART) 
			MPart part,
			EPartService partService) {
	   partService.savePart(part, false);
	   System.out.println("save executed");
	}
	
	@CanExecute
	public boolean canExecute(){
		return true;
	}
	
}
