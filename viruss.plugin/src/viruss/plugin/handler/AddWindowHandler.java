package viruss.plugin.handler;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MBasicFactory;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;

import viruss.plugin.helper.TechnicalHelper;

public class AddWindowHandler {
	
	public AddWindowHandler() {
		TechnicalHelper.printClassName(this.getClass(), "Constructor");
	}
	
	@Execute
	public void execute(MApplication application) {
		MWindow mWindow = MBasicFactory.INSTANCE.createTrimmedWindow();
		mWindow.setHeight(200);
		mWindow.setWidth(400);
		mWindow.getChildren().add(MBasicFactory.INSTANCE.createPart());
		application.getChildren().add(mWindow);
	}

	@CanExecute
	public boolean canExecute() {
		return true;
	}
}