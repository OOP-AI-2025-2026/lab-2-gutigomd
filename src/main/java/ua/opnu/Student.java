package ua.opnu;

public class Student {
    private final String name;
    private final int year;
    private final String[] courses;
    private int coursesCount;

    public Student(String name, int year) {
        this.name = name;
        if (year < 1 || year > 4) {
            this.year = 1;
        } else {
            this.year = year;
        }
        this.courses = new String[100];
        this.coursesCount = 0;
    }

    public void addCourse(String courseName) {
        if (courseName != null && coursesCount < courses.length) {
            courses[coursesCount] = courseName;
            coursesCount++;
        }
    }

    @SuppressWarnings("unused")
    public String[] getCourses() {

        String[] activeCourses = new String[coursesCount];
        System.arraycopy(courses, 0, activeCourses, 0, coursesCount);
        return activeCourses;
    }

    public int getCourseCount() {
        return coursesCount;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getTuition() {
        return year * 2000;
    }
}
