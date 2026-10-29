import java.util.Scanner;

public class Abecedarian {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("str: ");
	String str = in.nextLine();
	
	System.out.print("result: " + isAbecedarian(str));
    }
    
    public static boolean isAbecedarian(String str) {
	str = str.toLowerCase();
	char c = 'a';
	for(int i = 0; i < str.length(); i++) {
	    if(str.charAt(i) < c) return false;
	    c = str.charAt(i);
	}
	return true;
    }
}
