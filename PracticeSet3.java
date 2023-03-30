
public class PracticeSet3 {

	public static void main(String[] args) {
		
		//		Quetion no. 1
		
//		WAP in java to convert a string in lowercase.
		String name = "Dayashankar Yadav";
		String Lname = name.toLowerCase();
		System.out.println(Lname);
		
		//		Question no. 2
		
//		WAP in java to replace the spaces with underscrol.
		String myname = " Ajit Kumar Yadav Ji";
		String usname = myname.replace(' ', '_');
		System.out.println(usname);
		
		//		Question no. 3
		
//		WAP in java to fill in a letter tamplate which looks like below:
		//	letter = "Dear<|name|>, Thanks a lot";
		//	replace <|name|> with a string (some name).
		String letter = "Dear <|name|>, Thanks a lot!";
		letter = letter.replace("<|name|>", "Dayashankar");
		System.out.println(letter);
		
		//		Question no. 4
		
//		WAP in java to detect double and triple spaces in a string
		String mystring = "This is  code for double and triple spaces";
		System.out.println(mystring.indexOf("  "));
		System.out.println(mystring.indexOf("   ")); // -1 = no triple spaces
		
		//		Question no. 5
		
//		WAP in java to format the following letter using escapse sequence characters
		
		String myletter = "Dear Dayashankar, \n\tThis java course is nice. \nThanks!";
		System.out.println(myletter);
	}

}
