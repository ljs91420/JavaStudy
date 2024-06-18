package quiz_teacher;

import myobj.academy.AcademyStudent;
import myobj.academy.MlStudent;
import myobj.academy.NetworkStudent;

public class C09_Academy {
	public static void main(String[] args) {
		for (int i = 0; i < 2; ++i) {
			AcademyStudent stu;
			
			switch ((int)(Math.random() * 2)) {
				case 0:
					stu = new MlStudent();
					break;
				default:
					stu = new NetworkStudent();
					break;
			}
			
			AcademyStudent.printDetail(stu);
		}
	}
}
