package com.Demo;

public class Student {

	int sid;
	String sname;
	int salary;
	public static int count = 0;

	{
		count++;
	}

	public Student() {

	}

	public Student(int sid, String sname, int salary) {
		this.sid = sid;
		this.sname = sname;
		this.salary = salary;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Student.count = count;
	}

	public String display() {
		return "detail:" + sid + " " + sname + " " + " " + salary;

	}

}
