package com.Demo;

public class StudentTest {
	public static void main(String[] args) {

		Student ss = new Student(101, "ratan", 20000);
		System.out.println(ss.display());
		Student s1 = new Student(102, "abhi", 30000);
		System.out.println(s1.display());
		Student s2 = new Student(103, "kapil", 40000);
		System.out.println(s2.display());
		Student s3 = new Student(104, "Adi", 50000);
		System.out.println(s3.display());

		System.out.println(Student.count++);

	}

}
