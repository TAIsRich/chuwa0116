public class GenericMultiArguments {
	public static <E1,E2,E3> void printDifferentTypes(E1 e1,E2 e2, E3 e3){
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}

	public static void main(String[] args) {
		printDifferentTypes("1",123,213d);
	}
}
