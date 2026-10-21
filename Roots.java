import java.util.Scanner;

public class Roots {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Number: ");
	double given = in.nextDouble();
	if(given<0) {System.out.print("not an accepted number"); return;}
	else if(given==0) {System.out.print(0.0); return;}
	System.out.print(squareRoot(given));
    }
    
    public static double squareRoot(double given) {
	double root = given/2;
	while(Math.abs(root - (root+given/root)/2) > 0.0001) root = (root+given/root)/2;
	return root;
    }
}
