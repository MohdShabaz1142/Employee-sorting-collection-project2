package com;

import java.util.Comparator;

public class SortStudentbyid implements Comparator<Employee>
{
	public int compare(Employee x,Employee y)
	{

		int i=x.getid();
		int j=y.getid();

		return i-j;
		//return x.getid()-y.getid();
	}
}
