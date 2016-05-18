package viruss.plugin.contribute;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class HelloAddOnHandler {

	@Execute
	public void sayHello(Shell shell) {
		MessageDialog.openInformation(shell, "Hello", "Hello from Contribution Part 1");
	}
	
}
