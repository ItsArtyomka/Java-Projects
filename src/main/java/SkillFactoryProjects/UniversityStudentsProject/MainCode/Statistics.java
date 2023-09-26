package SkillFactoryProjects.UniversityStudentsProject.MainCode;

import SkillFactoryProjects.UniversityStudentsProject.Enums.StudyProfile;

public class Statistics {
    public StudyProfile studyProfile;
    public double averageExamScore;
    public int studentsInStudyProfile;
    public int studyProfileUniversities;
    public String universityName;

    public Statistics(StudyProfile studyProfile, double averageExamScore, int studentsInStudyProfile, int studyProfileUniversities, String universityName) {
        this.studyProfile = studyProfile;
        this.averageExamScore = averageExamScore;
        this.studentsInStudyProfile = studentsInStudyProfile;
        this.studyProfileUniversities = studyProfileUniversities;
        this.universityName = universityName;
    }

    public StudyProfile getStudyProfile() {
        return studyProfile;
    }

    public void setStudyProfile(StudyProfile studyProfile) {
        this.studyProfile = studyProfile;
    }

    public double getAverageExamScore() {
        return averageExamScore;
    }

    public void setAverageExamScore(double averageExamScore) {
        this.averageExamScore = averageExamScore;
    }

    public int getStudentsInStudyProfile() {
        return studentsInStudyProfile;
    }

    public void setStudentsInStudyProfile(int studentsInStudyProfile) {
        this.studentsInStudyProfile = studentsInStudyProfile;
    }

    public int getStudyProfileUniversities() {
        return studyProfileUniversities;
    }

    public void setStudyProfileUniversities(int studyProfileUniversities) {
        this.studyProfileUniversities = studyProfileUniversities;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
}
