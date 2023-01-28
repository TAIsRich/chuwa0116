package com.chuwa.methodreference;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTests {
	static class Employee{
		private int age;
		private String name;

		public Employee(int age, String name) {
			this.age = age;
			this.name = name;
		}

		public void setName(String name){
			this.name = name;
		}
		public void setAge(int age){
			this.age = age;
		}

		@Override
		public String toString() {
			return "Employee{" +
					"age=" + age +
					", name='" + name + '\'' +
					'}';
		}
	}
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		for(int i=0;i<100;++i){
			list.add(new Employee(i,"name"+i));
		}
		list.forEach(System.out::println);
	}
}
