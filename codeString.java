
public class codeString {

	public static void main(String[] args) {
		String s = "dumdum";
		//calling method on to word
		String answer = code(s);
	
	}
	
	//method
	public static String code(String s) {
	//creating variables
		String mess = "", combine =""; 	
		//for loop
		for(int i=0; i <s.length(); i++)
		{
			mess = mess + s.charAt(i);
			combine = combine + mess;
			
		}
		System.out.println(combine);
		return combine;
	}
}
