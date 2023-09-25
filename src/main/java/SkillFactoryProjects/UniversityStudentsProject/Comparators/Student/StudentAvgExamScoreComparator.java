package SkillFactoryProjects.UniversityStudentsProject.Comparators.Student;

import SkillFactoryProjects.UniversityStudentsProject.MainCode.Student;

public class StudentAvgExamScoreComparator implements StudentComparator {
    @Override
    public int compare(Student o1, Student o2) {
        return Float.compare(o1.getAvgExamScore(), o2.getAvgExamScore());
    }
}
