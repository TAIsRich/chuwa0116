public class GenericClass<E> {
	private E element;
	public GenericClass(E element){
		this.element = element;
	}
	public E getElement(){
		return this.element;
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		GenericClass<int[]> genericClass = new GenericClass<>(nums);
		for(int num: genericClass.getElement()){
			System.out.println(num);
		}
		int number = 23;
		GenericClass<Integer> integerGenericClass = new GenericClass<>(number);
		System.out.println(integerGenericClass.getElement());
	}
}
