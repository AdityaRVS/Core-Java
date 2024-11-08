package oopsConceptsClassObjectMethods;

public class StudentMain {

	public static void main(String[] args) {
		
		Student stu=new Student();
		
		stu.sid=1010;
		stu.sname="Krishna";
		stu.grad='A';
		
		stu.printStudentData();
		
		
		
		//creating object without reference reference varaible // this is not possible as every time new will create object below
		new Student();
		
		new Student().sid=102;
		new Student().sname="John";
		new Student().grad='B';
		new Student().printStudentData();
	
		
	}

}
