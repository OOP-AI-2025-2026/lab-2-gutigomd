package ua.opnu;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Олексій", 3);

        student.addCourse("ООП");
        student.addCourse("ОБЗД");
        student.addCourse("Теорія ймовірності");

        System.out.println(student.getName() + ": кількість вивчаємих дисциплін - " + student.getCourseCount());
        System.out.println(student.getName() + ": рік навчання - " + student.getYear());
        System.out.println(student.getName() + ": заплатив за навчання - " + student.getTuition());

    }
}