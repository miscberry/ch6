import java.util.Scanner;

public class Gauss {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("x: ");
	double x = in.nextDouble();
	System.out.print("n: ");
	int n = in.nextInt();
	
	System.out.print("result: " + gauss(x,n));
    }
    
    public static double gauss(double x, int n) {
	double term = 1;
	double sum = 0;
	for(int i = 0;i<n;i++) {
	    sum += term;
	    term = term * (-x*x) / (i+1);
	}
	return sum;
    }
}

