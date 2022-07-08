
package com.student;
class Std
{
int rno=1;//instance variable
static int batchno=2;

 void m1()
{
	int unipuneno=10;//local variable
	int batchno1;	
	System.out.println(unipuneno);
}
}
public class Studentsinfo {
	public static void main(String[] args) {
		Std s1=new Std();System.out.println(s1.rno);
		System.out.println(Std.batchno);
		s1.m1();

	}

}