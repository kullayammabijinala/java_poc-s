package com.oops;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeEncaps e=new  EmployeeEncaps();
		e.setId(101);
		e.setName("anu");
		e.setSalary(20000);
		e.setPassword("ankitha2324");
		int id=e.getId();
		String name=e.getName();
		double salary=e.getSalary();
		String password=e.getPassword();
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(password);
		// TODO Auto-generated method stub

	}

}
