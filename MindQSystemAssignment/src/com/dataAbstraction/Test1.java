package com.dataAbstraction;

public class Test1 
{
	/*
	 * Abstraction is the process of abstraction in Java which is used to hide certain details and only show the essential features of the object.
	 * In other words, it deals with the outside view of an object (interface). Now this is the part which confuses me always.
	 */

	private float base,height;
	
	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	public float area()
	{
		float result = (0.5f)*base*height;
		return result;
	}

	public static void main(String[] args)
	{
		
			Test1 obj = new Test1();
			obj.setBase(5.0f);
			obj.setHeight(3.0f);
			float Tarea = obj.area();
			System.out.println(obj.getBase());
			System.out.println(obj.getHeight());
			System.out.println("Triangle :"+Tarea );

	}

}
