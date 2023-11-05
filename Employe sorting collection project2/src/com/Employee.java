package com;

public class Employee
{
private int id;
private String name;
private double sal;


public Employee(int id,String name,Double sal)
{
	this.id=id;
	this.name=name;
	this.sal=sal;

}


public int getid()
{
	return id;
}
public String getname()
{
	return name;
}
public double getsal()
{
	return sal;
}


public String toString()
{
	return "id:"+id+"   name:"+name+"  sal:"+sal;
}


}
