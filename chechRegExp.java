import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class chechRegExp {

	public static void main(String[] args) {
		String regExp1="[a-z]+";
		String regExp2="[[az]+";
		
		
		try {
			
			Pattern.compile(regExp2);
			System.out.println("Valid");
		}catch (PatternSyntaxException e) {
			System.out.println("Invalid");
		}

	}

}
