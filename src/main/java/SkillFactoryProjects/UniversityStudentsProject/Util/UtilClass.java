package SkillFactoryProjects.UniversityStudentsProject.Util;

import SkillFactoryProjects.UniversityStudentsProject.Comparators.Student.*;
import SkillFactoryProjects.UniversityStudentsProject.Comparators.University.*;
import SkillFactoryProjects.UniversityStudentsProject.Enums.StudentComparatorTypes;
import SkillFactoryProjects.UniversityStudentsProject.Enums.UniversityComparatorTypes;

public class UtilClass {
    public static StudentComparator getStudentComparator(StudentComparatorTypes type) {
        switch (type) {
            case FULL_NAME -> {
                return new StudentFullNameComparator();
            }
            case UNIVERSITY_ID -> {
                return new StudentUniversityIdComparator();
            }
            case CURRENT_COURSE -> {
                return new StudentCurrentCourseNumberComparator();
            }
            case AVG_EXAM_SCORE -> {
                return new StudentAvgExamScoreComparator();
            }
            default -> throw new IllegalArgumentException("Invalid Student Comparator");
        }
    }

    public static UniversityComparator getUniversityComparator(UniversityComparatorTypes type) {
        switch (type) {
            case ID -> {
                return new UniversityIdComparator();
            }
            case FULL_NAME -> {
                return new UniversityFullNameComparator();
            }
            case SHORT_NAME -> {
                return new UniversityShortNameComparator();
            }
            case STUDY_PROFILE -> {
                return new UniversityStudyProfileComparator();
            }
            case YEAR_OF_FOUNDATION -> {
                return new UniversityYearOfFoundationComparator();
            }
            default -> throw new IllegalArgumentException("Invalid University Comparator");
        }
    }
}
