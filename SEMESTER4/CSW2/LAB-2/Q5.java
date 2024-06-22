//package lab1;
//import java.util.*;
//class College{
//	private  String collegeName;
//	private String collegeLoc;
//	
//}
//public void college(String collegeName, String collegeLoc) {
//	this.collegeName=collegeName;
//	this.collegeLoc=collegeLoc;
//}
//class Student{
//	private int studentId;
//	private String studentName;
//	College c_obj;
//}
//public class Q11 {
//
//	public static void main(String[] args) {
//		College obj=new College();
//		Object studentId;
//		Object studentName;
//		Student s=new Student();
//	
//	}
//
//}

import java.util.*;

class College{
	String Cname;
	String Cloc;
	College(String Cname,String Cloc){
		this.Cname=Cname;
		this.Cloc=Cloc;
	}
	 void PrintCollege(){
		System.out.println("College Name: "+Cname);
		System.out.println("College Location: "+Cloc);
	}
	
}

class S {
	long StdId;
	String Sname;
	College college;
	S(long StdId,String Sname,College college){
//		super(Cname,Cloc);
		this.StdId=StdId;
		this.Sname=Sname;
		this.college=college;

	}
//	void StdId(int StdId) {
//		this.StdId=StdId;
//	}
//	void Sname(String Sname) {
//		this.Sname=Sname;
//	}
	void PrintStudent() {
		System.out.println("Student Name: "+Sname);
		System.out.println("Student Id: "+StdId);
		System.out.println("College Name: "+college.Cname);
		System.out.println("College Location: "+college.Cloc);
	}
}

public class Q5 {
	public static void main(String args[]) {
		System.out.println("Student Details");
		College coll1=new College("ITER","BBS");
		S stu1=new S(18015,"Ashutosh",coll1);
		stu1.PrintStudent();
		System.out.println("College Details:");
		coll1.PrintCollege();
	}

}
