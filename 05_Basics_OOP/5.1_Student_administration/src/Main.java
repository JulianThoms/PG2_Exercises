public class Main {

    public static void main(String[] args) {

        University uni = new University();
        CourseOfStudy allgemeineInformatik = new CourseOfStudy("Allgemeine Informatik");
        uni.addCourseOfStudy(allgemeineInformatik);
        Student student1 = new Student("Felix", "13291", "felix@felix.de", allgemeineInformatik);


        uni.addStudent(student1);
        System.out.println(student1.getName());

        uni.editStudent(student1);

        System.out.println(student1.getName());
    }
}
