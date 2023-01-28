// You would have to define different method signatures in short for
// method overload to accommodate different types of parameters, which
// is very inflexible
public class NonGenericTests {
	public static boolean ifGreaterThan(int num1,int num2){
		return num1>num2;
	}
	public static boolean ifGreaterThan(double num1,double num2){
	    return num1>num2;
	}

	public static void main(String[] args) {
		System.out.println(ifGreaterThan(1,12));
		System.out.println(ifGreaterThan(12d,11d));
	}
}
