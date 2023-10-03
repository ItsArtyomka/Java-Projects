package SkillFactoryProjects.UniversityStudentsProject.Comparators.Student;


import SkillFactoryProjects.UniversityStudentsProject.Model.Student;

public class StudentCurrentCourseNumberComparator implements StudentComparator {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getCurrentCourseNumber(), o2.getCurrentCourseNumber());
    }
}
