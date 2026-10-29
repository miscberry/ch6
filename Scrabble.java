import java.util.Scanner;

public class Scrabble {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("tiles: ");
	String tiles = in.nextLine();
	System.out.print("str: ");
	String str = in.nextLine();
	
	System.out.print("result: " + canSpell(tiles, str));
    }
    
    public static boolean canSpell(String tiles, String str) {
	for(char c = 'a'; c <= 'z'; c++) {
	    int cTiles = 0;
	    int cStr = 0;
	    for(int i = 0; i < tiles.length(); i++) {
		if(tiles.charAt(i) == c) cTiles++;
	    }
	    for(int i = 0; i < str.length(); i++) {
		if(str.charAt(i) == c) cStr++;
	    }
	    if(cStr > cTiles) return false;
	}
	return true;
    }
}
