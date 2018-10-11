package com.InterfaceConcepts;

public class Test1 implements Printable,Jalgaon
{

	public static void main(String[] args) 
	{
		Test1 t = new Test1();
		t.print();
		t.railwayStation();
		t.busStand();
		t.snackJalgaon();
		t.joggingTrack();

	}

	@Override
	public void print() 
	{
		System.out.println("Welcome to Navi Mumbai");
		System.out.println("Value of Data:"+data);
	}

	@Override
	public void railwayStation() 
	{
		System.out.println("Welcome to Jalgaon Railway Station Junction");
		
	}

	@Override
	public void busStand() 
	{
		System.out.println("Welcome to Jalgaon Bus Stand Terminals");
		
	}

	@Override
	public void snackJalgaon()
	{
		System.out.println("Welcome to Jalgaon Snacks like AmarRagda, VadaPav, KandaKachori");
		
	}

	@Override
	public void joggingTrack()
	{
		System.out.println("Welcome to Jalgaon Jogging Track like Mehrun Talav");
		
	}

}
