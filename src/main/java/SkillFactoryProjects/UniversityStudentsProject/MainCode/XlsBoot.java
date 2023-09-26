package SkillFactoryProjects.UniversityStudentsProject.MainCode;

import SkillFactoryProjects.UniversityStudentsProject.Comparators.Student.StudentComparator;
import SkillFactoryProjects.UniversityStudentsProject.Comparators.University.UniversityComparator;
import SkillFactoryProjects.UniversityStudentsProject.Enums.StudentComparatorTypes;
import SkillFactoryProjects.UniversityStudentsProject.Enums.UniversityComparatorTypes;
import SkillFactoryProjects.UniversityStudentsProject.XlsIO.XlsReader;

import java.io.IOException;
import java.util.List;

public class XlsBoot {
    public static void main(String[] args) throws IOException {
        // Read and Sort
        List<University> universities = XlsReader.readXlsUniversities("src/main/resources/universityInfo.xlsx");
        UniversityComparator universityComparator = UtilClass.getUniversityComparator(UniversityComparatorTypes.YEAR_OF_FOUNDATION);
        universities.sort(universityComparator);
        String universitiesJson = JsonUtil.universityListToJson(universities);

        // JSON Existence Check
        System.out.println(universitiesJson);
        List<University> universitiesFromJson = JsonUtil.jsonToUniversityList(universitiesJson);

        // Collection and JSON Size Check
        System.out.println(universities.size() == universitiesFromJson.size());
        universities.forEach(university -> {
            String universityJson = JsonUtil.universityToJson(university);
            // JSON Existence Check
            System.out.println(universityJson);
            University universityFromJson = JsonUtil.jsonToUniversity(universityJson);
            // Element Output
            System.out.println(universityFromJson);
        });

        // Read and Sort
        List<Student> students = XlsReader.readXlsStudents("src/main/resources/universityInfo.xlsx");
        StudentComparator studentComparator = UtilClass.getStudentComparator(StudentComparatorTypes.AVG_EXAM_SCORE);
        students.sort(studentComparator);
        String studentsJson = JsonUtil.studentListToJson(students);

        // JSON Existence Check
        System.out.println(studentsJson);
        List<Student> studentsFromJson = JsonUtil.jsonToStudentList(studentsJson);


        System.out.println(students.size() == studentsFromJson.size());
        students.forEach(student -> {
            String studentJson = JsonUtil.studentToJson(student);
            // JSON Existence Check
            System.out.println(studentJson);
            Student studentFromJson = JsonUtil.jsonToStudent(studentJson);
            // Element Output
            System.out.println(studentFromJson);
        });
    }
}
