import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("number: ");
	int num = in.nextInt();
	
	System.out.print("result: " + convertToBinary(num));
    }
    
    public static String convertToBinary(int num) {
	String rbinary = "";
	String binary = "";
	
	if(num==0)return "0";
	while (num > 0) {
	    rbinary+=num%2;
	    num/=2;
	}
	
	for(int i = rbinary.length()-1; i >= 0; i--) {
	    binary+=rbinary.charAt(i);
	}
	return binary;
    }
}
