import java.io.*;
import java.util.Scanner;
public class Add {
	private int i;
	private int j;
	private int k;
	private int l;
	private int o;
        private int m;
	public static void main (String [] args) {
		int i = Integer.parseInt(args [0]);
		int j = Integer.parseInt(args [1]);
		int l = Integer.parseInt(args [2]);
                int m = Integer.parseInt(args [3]);
		int o = Integer.parseInt(args [4]);
		int k = i+j+l+m+o;
		System.out.println("The addition of "+i+" , "+j+" , " + l+" & "+m+" , "+o+" is = " +k);
	}
}
