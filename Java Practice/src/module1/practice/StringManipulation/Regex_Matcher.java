package module1.practice.StringManipulation;

import java.util.regex.Pattern;

public class Regex_Matcher {

	public static void main(String[] args) {
		
		String name ="Mr. Dinesh William_D";
		
		String regex = 
  "[a-zA-Z]+[\\.]{1}[\\s]{1}[A-Z]{1}[a-z]*[\\s]{1}[A-Z]{0,1}[a-z]*[^\\W\\*]*[a-zA-Z]*";
		
		System.out.println(Pattern.matches(regex, name));
	}
}
