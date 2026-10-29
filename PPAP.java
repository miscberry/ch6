import java.util.Scanner;

public class PPAP {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("What do you have? ");
	String str = in.nextLine();
	
	System.out.print("Uh! " + ppap(str) + ".");
    }
    
    public static String ppap(String str) {
	return str.substring(str.indexOf(", I have a")+11,str.length()) + " " + str.substring(9,str.indexOf(","));
    }
}
