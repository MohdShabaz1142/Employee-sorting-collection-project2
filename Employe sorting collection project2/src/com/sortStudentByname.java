package com;

import java.util.Comparator;

public class sortStudentByname  implements Comparator<Employee>
{

	public int compare(Employee x,Employee y)
	{
		String i=x.getname();
		String j=y.getname();
		
		return i.compareTo(j);
	//return x.getname().compareTo(y.getname());
	}
}
