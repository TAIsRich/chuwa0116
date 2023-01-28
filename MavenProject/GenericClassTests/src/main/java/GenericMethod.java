public class GenericMethod {
 public <T extends Comparable<T>> boolean ifGreaterOrEqualTo(T e1, T e2){
	 return e1.compareTo(e2)>=0;
 }

	public static void main(String[] args) {
		GenericMethod genericMethod = new GenericMethod();
		boolean b = genericMethod.ifGreaterOrEqualTo("abc", "sad");
		System.out.println(b);
		System.out.println(genericMethod.ifGreaterOrEqualTo(3,2));
	}
}
