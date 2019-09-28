package exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] integerArray= {1,2,3};
		int denominator=1;
		 try {
			 System.out.println(29/denominator);
			 if(denominator==0) {
				 throw new Exception ("Denominator is zero");
			 }
			 System.out.println(integerArray [3]);			
		 }
		 catch (NullPointerException npe) {
			 System.out.println("Nullpointer Exception handling");
		 }
		 catch(ArithmeticException exception) {
			 System.out.println("printing any kind of arithmetic exception" +exception.getMessage());
		 }
		 catch(ArrayIndexOutOfBoundsException npe) {
			 System.out.println("ArrayIndexoutofBound exception handling");
		 }
		 catch (Exception e) {
			 System.out.println("Genenric Exception handler");
		 }
		 finally {
			 System.out.println("finally block under exception");
		 }
		
		String pattern ="in";
				String stringToCheck="Happy leraning";
				Pattern compiledPattern=Pattern.compile(pattern);
				Matcher matcher=compiledPattern.matcher(stringToCheck);
				while(matcher.find()) {
					System.out.println(stringToCheck.substring(matcher.start(), matcher.end()));
	}
	}
}
