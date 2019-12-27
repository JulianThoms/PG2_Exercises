import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class University {
	List<Student> students;
	List<CourseOfStudy> courseOfStudies;

	public University() {
		students = new ArrayList<>();
		courseOfStudies = new ArrayList<>();
	}

	public void addStudent() {
		Scanner sc = new Scanner(System.in);
		String newStudentName;
		String newStudentEmail;
		String newStudentID;
		String userinput;
		CourseOfStudy newCourseOfStudy;
		int chosenNumber;

		System.out.println("Please enter a Name!");
		while (true) {
			userinput = sc.nextLine();
			if (userinput == null || userinput.equals("")) {
				System.out.println("Please enter a Name!");
			} else {
				newStudentName = userinput;
				break;
			}
		}

		System.out.println("Please enter an Email!");
		while (true) {
			userinput = sc.nextLine();
			if (userinput == null || userinput.equals("")) {
				System.out.println("Please enter an Email!");
			} else {
				newStudentEmail = userinput;
				break;
			}
		}
		System.out.println("Please enter an ID!");
		while (true) {
			userinput = sc.nextLine();
			if (userinput == null || userinput.equals("")) {
				System.out.println("Please enter an ID!");
			} else {
				newStudentID = userinput;
				break;
			}
		}
		while (true) {
			System.out.println("Please enter the Number of a Course of Study");
			int i = 0;
			for (CourseOfStudy courseOfStudy : courseOfStudies) {
				System.out.println((i + 1) + ":" + courseOfStudy.getName());
				i++;
			}
			userinput = sc.nextLine();
			if (userinput == null || userinput.equals("")) {
				continue;
			} else {
				try {
					chosenNumber = Integer.parseInt(userinput);
					--chosenNumber;
				} catch (Exception e) {
					continue;
				}
				if (courseOfStudies.size() < chosenNumber) {
					continue;
				} else {
					newCourseOfStudy = courseOfStudies.get(chosenNumber);
					break;
				}
			}
		}
		Student student = new Student(newStudentName, newStudentEmail, newStudentID, newCourseOfStudy);
		students.add(student);
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public boolean editStudent(Student student) {
		if (students.contains(student)) {
			System.out.println("What do you want to Change?\n1: ID\n2: Name\n3: Email");
			Scanner sc = new Scanner(System.in);
			String userinput = sc.nextLine();
			int userinputNumber;
			try {
				userinputNumber = Integer.parseInt(userinput);
			} catch (Exception e) {
				System.out.println("Not a Number between 1 and 3!");
				e.printStackTrace();
				return false;
			}
			switch (userinputNumber) {
				case 1:
					System.out.println("Please enter the new ID: \n");
					userinput = sc.nextLine();
					student.setStudentID(userinput);
					return true;

				case 2:
					System.out.println("Please enter the new Name: \n");
					userinput = sc.nextLine();
					student.setName(userinput);
					return true;

				case 3:
					System.out.println("Please enter the new Email: \n");
					userinput = sc.nextLine();
					student.setEmail(userinput);
					return true;

				default:
					System.out.println("Please enter a Number between 1 and 3! Exiting. . .");
					return false;

			}

		} else {
			return false;
		}
	}

	public void addCourseOfStudy(CourseOfStudy courseOfStudy) {
		courseOfStudies.add(courseOfStudy);
	}
}
