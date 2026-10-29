import java.util.Scanner;

public class Doubloon {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("str: ");
	String str = in.nextLine();
	
	System.out.print("result: " + isDoubloon(str));
    }
    
    public static boolean isDoubloon(String str) {
	str = str.toLowerCase();
	for(char c = 'a'; c <= 'z'; c++) {
	    int count = 0;
	    for(int i = 0; i < str.length(); i++) {
		if(str.charAt(i) == c) count++;
	    }
	    if(count != 2 && count != 0) return false;
	}
	return true;
    }
}
