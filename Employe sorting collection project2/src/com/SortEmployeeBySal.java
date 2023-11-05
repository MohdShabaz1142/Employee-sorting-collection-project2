package com;

import java.util.Comparator;

public class SortEmployeeBySal implements Comparator<Employee>
{
	public int compare(Employee x,Employee y)
	{

		Double i=x.getsal();//auto boxing
		Double j=y.getsal();

		return i.compareTo(j);
	//return x.getsal().compareTo(y.getsal());
	}
}
