package com;

import java.util.*;

public class Solution
{
	public static void main(String[] args) 
	{
		Employee e1= new Employee(100,"gowtham",20000.0);
		Employee e2= new Employee(103,"nandan",300000.0);
		Employee e3= new Employee(102,"veeresh",10000.0);

		List<Employee> l=new ArrayList();

		Map<Integer,Employee>m =new LinkedHashMap();

		m.put(e1.getid(), e1);
		m.put(e2.getid(), e2);
		m.put(e3.getid(), e3);

		Set<Integer> keySet = m.keySet();

		for(Integer k:keySet)
		{

			l.add(m.get(k));
			System.out.println(m.get(k));
		}
		System.out.println("------------");

		Scanner sc= new Scanner(System.in);
		System.out.println("1.sortstudenybyid/n2.sortstudentbyname/n3.sortstudentbysalary");
		System.out.println("enter the choice");
		int choice=sc.nextInt();
		
		
	
		
		switch(choice)
		{
		case 1: Collections.sort(l,new SortStudentbyid());
	    System.out.println(l);
		break;
		
		
		case 2: Collections.sort(l,new sortStudentByname());
		System.out.println(l);
		break;
		
		case 3: Collections.sort(l,new SortEmployeeBySal());
		System.out.println(l);
		break;
		
		default:
			System.out.println("invalid choice ");
		}

	}
}
