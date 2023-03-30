
public class StringMethods {

	public static void main(String[] args) {
		
		String name = "Harry";
		System.out.println(name);
		
		int value = name.length();
		System.out.println(value);
		
		String lstring = name.toLowerCase();
		System.out.println(lstring);
		
		String ustring = name.toUpperCase();
		System.out.println(ustring);
		
		String myname = "		Dayashankar			";
		System.out.println(myname);
		String trimmedstring = myname.trim();
		System.out.println(trimmedstring);
		
		String substring = name.substring(2);
		System.out.println(substring);
		System.out.println(myname.substring(4)); // it include space before the string
		
		System.out.println(name.substring(2, 4));
		System.out.println(myname.substring(2, 10));
		
		System.out.println(name.replace('r', 'p'));
		System.out.println(myname.replace('D', 'M'));
		System.out.println(myname.replace('D', 'N'));
		
		// for boolean it show true or false
		System.out.println(name.startsWith("d"));
		System.out.println(name.startsWith("h"));
		System.out.println(name.startsWith("H"));
		System.out.println(myname.endsWith("r"));
		System.out.println(myname.endsWith("	"));
		
		// index position of letter of string
		System.out.println(name.charAt(3));
		System.out.println(myname.charAt(11));
		System.out.println(myname.charAt(1));
		System.out.println(myname.charAt(2));

	}

}
