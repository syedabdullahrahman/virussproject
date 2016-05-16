package viruss.plugin.helper;

public class Helper {

	public static void printClassName(Class<?> aClass, String method){
	    System.out.println(aClass.getSimpleName()
				+ ": " + method +  " method called.");
	}
	
}
