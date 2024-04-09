public class StudentPractice {
    public static void main(String[] args) {

        //instantiate your Student class below
        Student student = new Student("pratheeba", 12345, 1, 4.0);
        System.out.println(student.getName());
        System.out.println(student.getStudentId());
        System.out.println(student.getNumberOfCredits());
        System.out.println(student.getGpa());
        Student.Course course = new Student.Course("java","yes",1);
        System.out.println(Student.Course.getTopic());
        System.out.println(Student.Course.getInstructor());
        System.out.println(Student.Course.getEnrolledStudents());
        Student.Teacher teacher = new Student.Teacher("pratheeba","Thangamani","java",2024);
        System.out.println(Student.Teacher.getFirstName);
        System.out.println(Student.Teacher.getLastName);
        System.out.println(Student.Teacher.getSubject);
        System.out.println(Student.Teacher.getYearsTeaching);
    }

}
