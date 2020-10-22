package Selenium;

public class StringImmutability {

	public static void main(String[] args) {


	StringBuffer A = new StringBuffer("Raja");
	StringBuffer B = new StringBuffer("Ram");
	
	A.append(B);
	System.out.println(A);
	
	String C = "Raja";
	String D = "Ram";
	
	C.concat(D);
	System.out.println(C);
	
		
		
		
		
	}

}
