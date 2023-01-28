package com.chuwa.Lambda;

import org.junit.Test;

public class LambdaTest {

	@Test
	public void overrideFoo() {
		Foo foo = new Foo() {
			@Override
			public String aMethod(String string) {
				return string + " from Foo";
			}
		};

		String str = foo.aMethod("ashjldlkjahs");
		System.out.println(str);
	}

	@Test
	public void lambdaFoo() {
		Foo foo = parameter -> parameter + " from Foo";
		String str = foo.aMethod("ashjldlkjahs");
		System.out.println(str);
	}

	@Test
	public void lambdaFoo2() {
		Foo foo = parameter -> parameter.toUpperCase() + " from Foo";
		String str = foo.aMethod("ashjldlkjahs");
		System.out.println(str);
	}

	@Test
	public void testFinal() {
		final String localVariable = "Local";
		Foo foo = parameter -> {
			return parameter + " " + localVariable;
		};
		String str = foo.aMethod("ashjldlkjahs");
		System.out.println(str);
	}

	/**
	 * 当variable只赋值一次，没有任何变动的时候，Java默认是final。
	 */
	@Test
	public void testEffectivelyFinal() {
		//默认有final
		String localVariable = "Local";
		Foo foo = parameter -> {
			return parameter + " " + localVariable;
		};

		String str = foo.aMethod("ashjldlkjahs");
		System.out.println(str);
	}

	@Test
	public void testFinal21() {
		String localVariable = "Local";
		localVariable = "LOCAL";
		Foo foo = parameter -> {
			return parameter;
		};
		System.out.println(foo.aMethod("hello"));
	}

	@Test
	public void testFinal22() {
		String localVariable = "Local";

		Foo foo = parameter -> {
			return parameter;
		};
		localVariable = "LOCAL"; // 新的内存地址

		System.out.println(foo.aMethod("hello"));
	}
    class Employee{
		private int age;
		public void setAge(int age){
			this.age=age;
		}
    }
	@Test
	public void testFinal3() {
		Employee employee = new Employee();
		employee.setAge(55);
		Foo foo = parameter -> {
			return parameter + " " + employee;
		};
		System.out.println(foo.aMethod("hello"));
	}
}
