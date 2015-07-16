package com.company;


import com.company.Package1.Honda;
import com.company.Package1.Java;
import com.company.Package1.Kawasaki;

public class Main
{

	public static void main(String[] args)
	{
		Kawasaki kawasaki = new Kawasaki();
		Java java = new Java();
		Honda honda = new Honda();
		kawasaki.race(honda);
		java.race(honda);
		kawasaki.race(java);
	}
}
