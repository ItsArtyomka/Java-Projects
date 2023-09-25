package SkillFactoryProjects.UniversityStudentsProject.Comparators.University;

import SkillFactoryProjects.UniversityStudentsProject.MainCode.University;

import java.util.Comparator;

public interface UniversityComparator extends Comparator<University> {
    int compare(University o1, University o2);
}
