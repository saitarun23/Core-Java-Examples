package education.main;
//import education.college.*;				//we can use all classes and interface part of college package
import education.college.Attendance;
//import education.school.Attendance;

public class DemoTest {

	public static void main(String[] args) {
		Attendance att1=new Attendance();
		att1.display();
		education.school.Attendance att2=new education.school.Attendance();
		att2.display();
	}
}

/*
	Output
	college Attendance
	school Attendance
*/