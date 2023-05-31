package grades;
public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("consuellamoore123");
        student1.addGrade(100);
        student1.addGrade(95);
        student1.addGrade(75);
        student1.addGrade(98);
        student1.addGrade(93);
        student1.addGrade(85);


        System.out.println("Student Name: " + student1.getName());
        System.out.println("Grades: " + student1.getGradeAverage());
        System.out.println("Grades:" + student1.getGrades());


        Student student2 = new Student("Theodoric-Graham");
        student2.addGrade(80);
        student2.addGrade(99);
        student2.addGrade(95);
        student2.addGrade(91);
        student2.addGrade(92);
        student2.addGrade(93);

        System.out.println("Student Name: " + student2.getName());
        System.out.println("Grades: " + student2.getGradeAverage());
        System.out.println("Grades:" + student2.getGrades());


        Student student3 = new Student("Timothy Varjan");
        student3.addGrade(100);
        student3.addGrade(100);
        student3.addGrade(97);
        student3.addGrade(99);
        student3.addGrade(98);
        student3.addGrade(97);

        System.out.println("Student Name: " + student3.getName());
        System.out.println("Grades: " + student3.getGradeAverage());
        System.out.println("Grades:" + student3.getGrades());


        Student student4 = new Student("Jakira Dunson");
        student4.addGrade(100);
        student4.addGrade(100);
        student4.addGrade(100);
        student4.addGrade(99);
        student4.addGrade(98);
        student4.addGrade(97);

        System.out.println("Student Name: " + student4.getName());
        System.out.println("Grades: " + student4.getGradeAverage());

        System.out.println("Grades:" + student4.getGrades());

    }
}

