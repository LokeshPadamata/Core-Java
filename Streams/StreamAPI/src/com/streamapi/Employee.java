package com.streamapi;
import java.util.*;
import java.util.stream.*;
class Employee1{
	int id;
	String name;
	double salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee1(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
public class Employee {
	public static void main(String[] args) {
		
		ArrayList<Employee1> list = new ArrayList<Employee1>();
		list.add(new Employee1(1, "raju", 10000));
		list.add(new Employee1(2, "ravi", 70000));
		list.add(new Employee1(3, "kiran", 30000));
		list.add(new Employee1(4, "sai", 60000));
		list.add(new Employee1(5, "ashok", 50000));
		System.out.println("Original Employee List");
		list.forEach(i->System.out.println(i));
		System.out.println("----------------------------------------------");
		System.out.println("Sorting List by Employee Name");
		List<Object> sortedbyName =list.stream().sorted((i1,i2)->i1.name.compareTo(i2.name)).collect(Collectors.toList());
		sortedbyName.forEach(i->System.out.println(i));
		System.out.println("------------------------------------------------");
		System.out.println("Sorting by Salary");
		List<Object> sortedbySalary = list.stream().sorted(Comparator.comparingDouble(Employee1 :: getSalary)).collect(Collectors.toList());
		sortedbySalary.forEach(i->System.out.println(i));
		System.out.println("-------------------------------------------------");
		System.out.println("Salary below 50000");
		List<Object> salarybelowmark =list.stream().filter(i->i.salary<50000).collect(Collectors.toList());	
		salarybelowmark.forEach(i->System.out.println(i));
		System.out.println("-------------------------------------------------");
		System.out.println("Salary Descending to Descending");
		List<Object> saldesc = list.stream().sorted(Comparator.comparingDouble(Employee1 :: getSalary).reversed()).collect(Collectors.toList());
		saldesc.forEach(i->System.out.println(i));
	}
}
