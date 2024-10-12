package functional;

public class FunctionExample1 {
	
	public static String addString(String str) {
		
		
		 return FunctionExample.addSomeString.apply(str);
		
	}
	
	public static void main(String[] args) {
		
		String str = addString("Hello");
		System.out.println(str);
		
	}

}
