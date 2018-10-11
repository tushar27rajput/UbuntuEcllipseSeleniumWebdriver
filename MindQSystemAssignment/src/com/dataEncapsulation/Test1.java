package com.dataEncapsulation;

public class Test1 
{

	private int empSSNumber;
	private String empName;
	private int empAge;
	
	public static void main(String[] args) 
	{
		
		Test1 obj = new Test1();
		obj.setEmpSSNumber(1001);
		obj.setEmpName("Tushar Rajput");
		obj.setEmpAge(28);

		System.out.println(obj.getEmpSSNumber());
		System.out.println(obj.getEmpName());
		System.out.println(obj.getEmpAge());
		
	}

	public int getEmpSSNumber() {
		return empSSNumber;
	}

	public void setEmpSSNumber(int empSSNumber) {
		this.empSSNumber = empSSNumber;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}
