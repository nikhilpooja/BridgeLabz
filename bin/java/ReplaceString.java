import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ReplaceString{
	public static void main(String[] args)
	{	
		Scanner in = new Scanner(System.in);
		String msg = "Hello <<UserName>>, How are you ?";
		System.out.println("Enter your name");
		String name = in.next();
		String fname = "<<UserName>>";
		Pattern patt =  Pattern.compile(fname);
		Matcher m = patt.matcher(msg);
		msg = m.replaceAll(name);
		System.out.println(msg);							
	}	
}
	
