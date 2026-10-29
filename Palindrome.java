import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("str: ");
	String str = in.nextLine();
	
	System.out.print("result: " + isPalindrome(str));
    }
    
    public static boolean isPalindrome(String str) {
	String nonLetters = ",.:;()[]{}!@#$%^&* ";
	String pureStr = "";
	for(int i = 0; i < str.length(); i++) {
	    String one = str.substring(i,i+1);
	    if (!nonLetters.contains(one)) {
		pureStr += str.charAt(i);
	    }
	}
	for(int i = 0; i < pureStr.length()/2; i++) {
	    if(pureStr.charAt(i) != pureStr.charAt(pureStr.length()-i-1)) {
		return false;
	    }
	}
	return true;
    }
}
