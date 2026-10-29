import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("msg: ");
	String msg = in.nextLine();
	
	System.out.print("result: " + pigLatin(msg));
    }
    
    public static String pigLatin (String msg) {
	String result = "";
	for(int i = 0; i < msg.length(); i++) {
	    if(i != 0 && msg.charAt(i-1) != ' ') {
		result += msg.charAt(i);
	    }
	    if(i == msg.length()-1 || msg.charAt(i+1) == ' ') {
		result += msg.substring(msg.lastIndexOf(" ", i)+1, msg.lastIndexOf(" ", i)+2) + "ay";
	    }
	}
	return result;
    }
}
