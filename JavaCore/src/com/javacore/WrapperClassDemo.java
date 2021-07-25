package com.javacore;

public class WrapperClassDemo {

	public static void main(String[] args) {


		String str = "$45"; //it gives Run time error 
		String sr= str.substring(1); 
		int intvalue =Integer.parseInt(sr); // use Wrapper class
		System.out.println("Intvalue is equal to "+intvalue);
		
		System.out.println("========================");

		int i = 45; //it gives Run time error 
		Float.

		int intvalue =Integer.parseInt(sr);
		System.out.println("Intvalue is equal to "+intvalue);
		System.out.println("===============");



		String s ="$548855";
		String t= s.substring(2);
		String s1=s.substring(1, 3);// doller sign will not exist 
		String s2=s.substring(0, 3);

		System.out.println("S1 is --"+s1);
		System.out.println("t is --"+t);
		System.out.println("s2 is --"+s2);

		System.out.println("=================");
		int nt=88;
		Integer n =nt; //autoboxing 
		System.out.println("N is -"+n);

		//This is object and from object to primitive
		Float f= new Float(nt); // This is unboxing 
		Float f1=55.7f;
		System.out.println("This is unboxing"+f1);

		System.out.println("==========");

*/		
		
		int a = 10;  // primitive to object 
		Integer et = a; // this is object 
		System.out.println(et); //Autoboxing Primitive to Object
		System.out.println("=============");
		
		//This is  Wrapper class Object 
		Double d = new Double(a); // Object to primitive 
		System.out.println("Double value is "+d);
		
		/*Integer k= new Integer(a);
		System.out.println("This is another unboxing "+a);
		System.out.println("K is the result of "+k);
*/
	}
}

