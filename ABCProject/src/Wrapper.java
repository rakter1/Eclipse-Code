
public class Wrapper {
	
	public static void main(String[] args) {
		int i= 45; 
		Integer wrapper = new Integer(i);
		System.out.println(wrapper);
		
		int unwrapper =wrapper.intValue();
		System.out.println(unwrapper);
	}

}
