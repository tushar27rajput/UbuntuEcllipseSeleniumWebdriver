package com.HashMapJava;

import java.util.HashMap;
import java.util.Map;

public class Test1 
{

	public static void main(String[] args) 
	{
		
		//Create HashMAP 
		HashMap<Integer,String> x = new HashMap<Integer,String>();
		
		//Insert Data in Pairs
		
		x.put(1001, "Tushar Rajput");
		x.put(1002, "Rujesh Rajput");
		x.put(1003, "Jayesh Rajput");
		x.put(1004, "Kalyani Rajput");
		
		//Change Value depends on Key
		x.put(1004, "Mau Rajput");
		
		//Change Key 
		x.put(1010, x.remove(1001));
		
		//Get pairs of Data
		for(Map.Entry<Integer,String>e:x.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}
