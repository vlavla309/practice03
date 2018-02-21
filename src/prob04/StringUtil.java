package prob04;

public class StringUtil {
	public static String concatenate( String[] str ) {
		String result= new String();
		for (String string : str) {
			result+=string;
		}
		return result;
	}
	
}
