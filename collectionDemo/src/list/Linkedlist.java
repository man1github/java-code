package list;

import java.util.*;

public class Linkedlist {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Student stu = new Student(1,"Manoj","sirkali");
		Student stu1 = new Student(2,"Mahendiran","kallakurichi");
		Student stu2 = new Student(3,"vengadesh","mangaimadam");
		Student stu3 = new Student(0,"ravi","chennai");
	
		
		LinkedList <Student> ls = new LinkedList<>();
		ls.add(stu);
		ls.add(stu1);
		ls.add(stu2);
		ls.addLast(stu2);
		ls.addFirst(stu3);
		
		boolean check = stu2.equals(stu3);
		System.out.println(check);	
			
		for (Student s : ls) {
			System.out.println("Roll no is :" + s.rollno + ", Name is :" + s.name + ", Location is " + s.location);
		}
		

	}

}
