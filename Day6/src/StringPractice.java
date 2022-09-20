import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPractice {
	
	public static String rev(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
			rev+=s.charAt(i);
		return rev;
	}
	
	public static String validate(String s) {
		 String regex = "^(.+)@(.+)$";  
		 Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(s);
		 if(matcher.matches())
			 return "Valid";
		else return "Invalid";
	}
	public static void main(String[] args) {
		String s="Sagar";
		
//		System.out.println("Original String: "+s+"\nReversed String: "+ rev(s));
		System.out.println(validate("wiley@g@.com"));
	}

}
