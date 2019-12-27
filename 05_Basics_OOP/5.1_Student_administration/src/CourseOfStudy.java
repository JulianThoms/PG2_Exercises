import java.util.ArrayList;
import java.util.List;

public class CourseOfStudy {
	List<Course> courses;
	String name;

	public CourseOfStudy(String name) {
		this.name = name;
		courses = new ArrayList<>();
	}

	public void addCourse(Course course) {
		this.courses.add(course);
	}

	public String getName() {
		return name;
	}
}
