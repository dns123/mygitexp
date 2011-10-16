import java.io.*;
import java.util.Scanner;
public class Add {
	private int i;
	private int j;
	private int k;
	public static void main (String [] args) {
		int i = Integer.parseInt(args [0]);
		int j = Integer.parseInt(args [1]);
		int k = i+j;
		System.out.println("The addition of "+i+" & " + j+ " is = " +k);
	}
}
