package regex;
//import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexExamples {

	public static void main(String[] args) {
		boolean result = Pattern.compile("[abc]xyz").matcher("axyz").matches(); //[abc] either a or b or c
		System.out.println(result);
		boolean res = Pattern.compile("[^abc]xyz").matcher("1xyz").matches();  // [^abc]xyz not in a,b,c and x,y,z all includes
		System.out.println(res);
		boolean m = Pattern.compile("[^abc][abc]xyz").matcher("1bxyz").matches(); // first letter is not a,b,c and second letter is in a,b,c and xyz all follows
		System.out.println(m);
		
	}

}
