public class Student {
	private String name;
	private String studentID;
	private String email;
	private CourseOfStudy courseOfStudy;

	public Student(String name, String studentID, String email, CourseOfStudy courseOfStudy) {
		setName(name);
		setStudentID(studentID);
		setEmail(email);
		setCourseOfStudy(courseOfStudy);
	}

	public CourseOfStudy getCourseOfStudy() {
		return courseOfStudy;
	}

	public void setCourseOfStudy(CourseOfStudy courseOfStudy) {
		this.courseOfStudy = courseOfStudy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
