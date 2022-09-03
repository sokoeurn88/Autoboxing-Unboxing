package autoboxing_unboxing;

public class AutoboxingUnboxing {

	public static void main(String[] args) {

		//int, float, double
		
		int i = 5;	//primitive datatype
		Integer ii = new Integer(i);	//boxing or wrapping
		System.out.println(ii);
		
		int j = ii.intValue();	//unboxing or unwrapping
		System.out.println(j);

		Integer value = i;	//autoboxing
		System.out.println(i);
		
		int k = value;	//autounboxing
		System.out.println(k);
		
		String str = "123";
		System.out.println(str);
		int n = Integer.parseInt(str);
		System.out.println(n);
	}

}
