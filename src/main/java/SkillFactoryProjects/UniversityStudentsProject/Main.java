package SkillFactoryProjects.UniversityStudentsProject;

import SkillFactoryProjects.UniversityStudentsProject.Comparators.Student.StudentComparator;
import SkillFactoryProjects.UniversityStudentsProject.Comparators.University.UniversityComparator;
import SkillFactoryProjects.UniversityStudentsProject.Enums.StudentComparatorTypes;
import SkillFactoryProjects.UniversityStudentsProject.Enums.StudyProfile;
import SkillFactoryProjects.UniversityStudentsProject.Enums.UniversityComparatorTypes;
import SkillFactoryProjects.UniversityStudentsProject.Model.Student;
import SkillFactoryProjects.UniversityStudentsProject.Model.University;
import SkillFactoryProjects.UniversityStudentsProject.Util.UtilClass;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"SpellCheckingInspection", "DuplicatedCode"})
public class Main {

    public static void main(String[] args) {
        // Logger Co

        //Lists
        List<Student> students = new ArrayList<>();
        List<University> universities = new ArrayList<>();

        //Appending to lists
        //Students
        students.add(new Student("Alice Johnson", "U001", 1, 3.8f));
        students.add(new Student("Bob Smith", "U002", 2, 3.5f));
        students.add(new Student("Charlie Brown", "U003", 3, 3.9f));
        students.add(new Student("David Lee", "U004", 4, 3.6f));
        students.add(new Student("Emma Wilson", "U005", 2, 3.7f));
        students.add(new Student("Frank Turner", "U006", 3, 5.4f));
        students.add(new Student("Grace Davis", "U007", 4, 3.9f));
        students.add(new Student("Hannah White", "U008", 1, 2.8f));
        students.add(new Student("Isaac Martin", "U009", 2, 3.5f));
        students.add(new Student("Jack Harris", "U010", 3, 4.7f));
        //Universities
        universities.add(new University("U001", "XYZ University", "XYZU", 1990, StudyProfile.LINGUISTICS));
        universities.add(new University("U002", "ABC University", "ABCU", 1985, StudyProfile.PHYSICS));
        universities.add(new University("U003", "DEF University", "DEFU", 2000, StudyProfile.MEDICINE));
        universities.add(new University("U004", "GHI University", "GHIU", 1995, StudyProfile.MATHEMATICS));
        universities.add(new University("U005", "JKL University", "JKLU", 1980, StudyProfile.COMPUTER_SCIENCE));
        universities.add(new University("U006", "MNO University", "MNOU", 1992, StudyProfile.MEDICINE));
        universities.add(new University("U007", "PQR University", "PQRU", 1988, StudyProfile.LINGUISTICS));
        universities.add(new University("U008", "STU University", "STUU", 2005, StudyProfile.MATHEMATICS));
        universities.add(new University("U009", "VWX University", "VWXU", 1999, StudyProfile.MEDICINE));
        universities.add(new University("U010", "YZA University", "YZAU", 1982, StudyProfile.PHYSICS));

        // Student Comparators
        StudentComparator nameComparator = UtilClass.getStudentComparator(StudentComparatorTypes.FULL_NAME);
        StudentComparator uniIdComparator = UtilClass.getStudentComparator(StudentComparatorTypes.UNIVERSITY_ID);
        StudentComparator currentCourseComparator = UtilClass.getStudentComparator(StudentComparatorTypes.CURRENT_COURSE);
        StudentComparator avgExamScoreComparator = UtilClass.getStudentComparator(StudentComparatorTypes.AVG_EXAM_SCORE);

        // University Comparators
        UniversityComparator idComparator = UtilClass.getUniversityComparator(UniversityComparatorTypes.ID);
        UniversityComparator fullNameComparator = UtilClass.getUniversityComparator(UniversityComparatorTypes.FULL_NAME);
        UniversityComparator shortNameComparator = UtilClass.getUniversityComparator(UniversityComparatorTypes.SHORT_NAME);
        UniversityComparator studyProfileComparator = UtilClass.getUniversityComparator(UniversityComparatorTypes.STUDY_PROFILE);
        UniversityComparator yearOfFoundationProfileComparator = UtilClass.getUniversityComparator(UniversityComparatorTypes.YEAR_OF_FOUNDATION);

        //STUDENTS SORTING
        //Name Sorting
        students.stream()
                .sorted(nameComparator)
                .forEach(System.out::println);

        //Uni Id Sorting
        students.stream()
                .sorted(uniIdComparator)
                .forEach(System.out::println);

        //Current Course Sorting
        students.stream()
                .sorted(currentCourseComparator)
                .forEach(System.out::println);

        //Avg Exam Score Sorting
        students.stream()
                .sorted(avgExamScoreComparator)
                .forEach(System.out::println);

        //UNIVERSITY SORTING
        //Id Sorting
        universities.stream()
                .sorted(idComparator)
                .forEach(System.out::println);

        //Full Name Sorting
        universities.stream()
                .sorted(fullNameComparator)
                .forEach(System.out::println);

        //Short Name Sorting
        universities.stream()
                .sorted(shortNameComparator)
                .forEach(System.out::println);

        //Study Profile Sorting
        universities.stream()
                .sorted(studyProfileComparator)
                .forEach(System.out::println);

        //Year Of Foundation Profile Sorting
        universities.stream()
                .sorted(yearOfFoundationProfileComparator)
                .forEach(System.out::println);
    }
}
