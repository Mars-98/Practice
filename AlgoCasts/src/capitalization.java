
public class capitalization {
	public static void main(String[]args) {
		String h = "      hello    my love!";
		String result = Capitalization2(h);
		System.out.print(result);
		
	}
	
	public static String Capitalization(String t) {
		String result = "";
		char lower;
		for(int i = t.length()-1; i>=0; i--) {
			if(i == 0 || t.charAt(i-1) == ' ') {
				lower = Character.toUpperCase(t.charAt(i));
				result = lower + result;
			}else {
				result = t.charAt(i) + result;
			}
		}
		return result;
	}
	
	
	public static String Capitalization2(String t) {
		//t = t.trim(); WE DONT NEED TO DO ANYMORE BC WE'RE CHECKING WHETHER THE STRING IS EMPTY ANYWAY
		String result = "";//, newR = "";
		char upper;
		String[] r = t.split(" ");
		
		for(String c: r) {
			//when split is called, empty strings are created from beginning or 
			//trailing spaces, and you can't call charAt on an empty string
			//Therefore it's safer to just trim before you split
			if (!c.isEmpty()) {//must check because there could be useless spaces inside of the split string
				upper = Character.toUpperCase(c.charAt(0));
				//replace returns the string result after the first character has been 
				//replaced with the capital character
				result += c.replace(c.charAt(0), upper) + " "; // this instead
				//newR += String.join(" ",result) + " "; //I could use this or just do 
			}
		}
		
		return result;
	}
}
