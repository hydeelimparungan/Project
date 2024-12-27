class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class School {
    private String schoolName;
    private Student student;

    public School(String schoolName, String studentName) {
        this.schoolName = schoolName;
        this.student = new Student(studentName);
    }

    public void showSchoolInfo() {
        System.out.println(schoolName + " has student: " + student.getName());
    }
}

public class composition {
    public static void main(String[] args) {
        School school1 = new School("Greenwood High", "herondio");
        School school2 = new School("Lakeside Academy", "limparungan");

        school1.showSchoolInfo();
        school2.showSchoolInfo();
    }
}
