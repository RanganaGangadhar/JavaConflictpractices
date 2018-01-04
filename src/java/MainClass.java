package java;

import java.util.Arrays;
import java.util.List;

public class MainClass {

	public MainClass() {		
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		List<String> ggg = Arrays.asList("one","two","three","four","five","six","seven");
		System.out.println("((((((((Testing;;;1)))))");
	    ggg.forEach((n) -> System.out.println("I got"+n));
	    
	    List<Integer> sss = Arrays.asList(12,23,24,35,67);
	    System.out.println("(((((Testing:::2))))");
	    sss.forEach((n) -> System.out.println(n));
	}
}
