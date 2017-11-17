
public class Course {
	private String courseName;
	private int numberOfStudents;
	//It determines number of registered students
	//numOfstudents can register for a course is 10.
	
	//Array named students stores the registered students.
	Student[] students =new Student[10];
   
	public Course(String courseName) {
		this.courseName = courseName;
	}
	public Student[] getStudents() {
		return students;
	}
	
	public boolean isFull() {
		if ( numberOfStudents == 10) {
			return true;
		}
		    return false;
    }
	
	public String getCourseName() {
		return courseName;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	/*when a student register for course ,then he is added to array if number of 
	 *registered students are less than 10. 
	 */
	public void registerStudent(Student student) {		
		if (!isFull()) {
			students[numberOfStudents] = student;
			numberOfStudents++;
			System.out.println(student.getName() + "  You have successfully registered in course " + getCourseName() );
		} else {
			System.out.println( student.getName()  + " Sorry Can't register as the class is full");	
		}
		
    }
	
}
