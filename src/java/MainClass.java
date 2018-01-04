package java;

import java.util.Arrays;
import java.util.List;

public class MainClass {

	public MainClass() {		
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		List<String> ggg = Arrays.asList("one","two","three","four");
		System.out.println("How are you doing now");
	    ggg.forEach((n) -> System.out.println("I got"+n));
	}
}
