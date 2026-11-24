package unidad3;

import java.util.Scanner;

class CourseStudent {
    private String name;
    private float grade;

    public CourseStudent(String name, float grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        if (grade >= 0 && grade <= 5) {
            this.grade = grade;
        }
    }

    public void showInfo() {
        System.out.println(name + " - Nota: " + grade);
    }
}

public class Student {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        CourseStudent[] course = new CourseStudent[3];

        for (int i = 0; i < course.length; i++) {
            System.out.print("Nombre del estudiante " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Nota de " + name + ": ");
            float grade = scanner.nextFloat();
            scanner.nextLine();

            course[i] = new CourseStudent(name, grade);
        }

        System.out.println("\nListado de estudiantes:");
        for (int i = 0; i < course.length; i++) {
            course[i].showInfo();
        }

        scanner.close();
    }
}