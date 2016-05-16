package viruss.plugin.helper;

public class TechnicalHelper {

	public static void printClassName(Class<?> aClass, String method){
	    System.out.println(aClass.getSimpleName()
				+ ": " + method);
	}
	
}
