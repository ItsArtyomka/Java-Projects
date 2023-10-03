package SkillFactoryProjects.UniversityStudentsProject.Model;

import SkillFactoryProjects.UniversityStudentsProject.Enums.StudyProfile;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

@SuppressWarnings("UnusedReturnValue")
public class Statistics {
    @XmlElement(name = "universityProfile")
    public StudyProfile studyProfile;
    @XmlElement(name = "avgScore")
    public double averageExamScore;
    @XmlTransient
    public int studentsInStudyProfile;
    @XmlTransient
    public int studyProfileUniversities;
    @XmlTransient
    public String universityName;

    public Statistics() {

    }

    public StudyProfile getStudyProfile() {
        return studyProfile;
    }

    public Statistics setStudyProfile(StudyProfile studyProfile) {
        this.studyProfile = studyProfile;
        return this;
    }

    public double getAverageExamScore() {
        return averageExamScore;
    }

    public Statistics setAverageExamScore(double averageExamScore) {
        this.averageExamScore = averageExamScore;
        return this;
    }

    public int getStudentsInStudyProfile() {
        return studentsInStudyProfile;
    }

    public Statistics setStudentsInStudyProfile(int studentsInStudyProfile) {
        this.studentsInStudyProfile = studentsInStudyProfile;
        return this;
    }

    public int getStudyProfileUniversities() {
        return studyProfileUniversities;
    }

    public Statistics setStudyProfileUniversities(int studyProfileUniversities) {
        this.studyProfileUniversities = studyProfileUniversities;
        return this;
    }

    public String getUniversityName() {
        return universityName;
    }

    public Statistics setUniversityName(String universityName) {
        this.universityName = universityName;
        return this;
    }
}
