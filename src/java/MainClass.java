package java;

import java.util.Arrays;
import java.util.List;

public class MainClass {

	public MainClass() {		
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		List<String> ggg = Arrays.asList("one","two","three","four","five" );
		System.out.println("::::Entering:::First:::loop:::::");
	    ggg.forEach((n) -> System.out.println("I got"+n));
	    displayOutput();
	}
	private static void displayOutput() {
		System.out.println("Entering:::Second::::loop");
		List<Integer> kkk = Arrays.asList(1,2,3,4,5);
		
	}
	
	
	
	
}
