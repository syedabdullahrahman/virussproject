package viruss.plugin.handler;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;


public class ExitHandler {
	  @Execute
	  public void execute(IWorkbench workbench, Shell shell) {
		  MessageDialog.openInformation(shell, "exit","bye bye");
		  workbench.close();
	  }
	  
	  @CanExecute
	  public boolean canExecute() {
	    return true;
	  }
}
