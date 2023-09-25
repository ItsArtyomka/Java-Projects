package SkillFactoryProjects.UniversityStudentsProject.Enums;

public enum StudyProfile {
    PHYSICS("Physics"),
    COMPUTER_SCIENCE("IT"),
    MATHEMATICS("Mathematics"),
    MEDICINE("Medicine"),
    LINGUISTICS("Linguistics");

    private final String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return this.profileName;
    }
}
