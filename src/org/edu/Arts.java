package org.edu;

public class Arts extends Education {
	
	public void bsc()
	{
		System.out.println("bsc");
	}
	public void bEd()
	{
		System.out.println("bEd");
	}
	
	public void bA()
	{
		System.out.println("bA");
	}
	
	public void bBA()
	{
		System.out.println("bBA");
	}
	
	public void ug()
	{
		System.out.println("ug");
		System.out.println("---------------------");
		
	}
	
	public void pg()
	{
		System.out.println("pg");
		System.out.println("---------------------");
		
	}
	
	public static void main(String[] args) {
		Arts a = new Arts();
		a.bA();
		a.bBA();
		a.bEd();
		a.bsc();
		a.pg();
		a.ug();
		
	}
	

}
