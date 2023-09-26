package SkillFactoryProjects.UniversityStudentsProject.XlsIO;

import SkillFactoryProjects.UniversityStudentsProject.Enums.StudyProfile;
import SkillFactoryProjects.UniversityStudentsProject.MainCode.Student;
import SkillFactoryProjects.UniversityStudentsProject.MainCode.University;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class XlsReader {
    private XlsReader() {
    }

    public static List<University> readXlsUniversities(String filePath) throws IOException {
        // Universities List
        List<University> universities = new ArrayList<>();

        // File Opening
        FileInputStream fileInputStream = new FileInputStream(filePath);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet xssfSheet = xssfWorkbook.getSheet("Universities");

        // Iterating Through
        Iterator<Row> rows = xssfSheet.iterator();
        rows.next();

        // Student File Reading
        while (rows.hasNext()) {
            Row currentRow = rows.next();
            University university = new University();
            universities.add(university);
            university.setId(currentRow.getCell(0).getStringCellValue());
            university.setFullName(currentRow.getCell(1).getStringCellValue());
            university.setShortName(currentRow.getCell(2).getStringCellValue());
            university.setYearOfFoundation((int) currentRow.getCell(3).getNumericCellValue());
            university.setMainProfile(StudyProfile.valueOf(StudyProfile.class, currentRow.getCell(4).getStringCellValue()));
        }
        return universities;
    }

    public static List<Student> readXlsStudents(String filePath) throws IOException {
        // Students List
        List<Student> students = new ArrayList<>();

        // File Opening
        FileInputStream fileInputStream = new FileInputStream(filePath);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet xssfSheet = xssfWorkbook.getSheet("Students");

        // Iterate Through Rows
        Iterator<Row> rows = xssfSheet.iterator();
        rows.next();

        // Student File Reading
        while (rows.hasNext()) {
            Row currentRow = rows.next();
            Student student = new Student();
            students.add(student);
            student.setUniversityId(currentRow.getCell(0).getStringCellValue());
            student.setFullName(currentRow.getCell(1).getStringCellValue());
            student.setCurrentCourseNumber((int)currentRow.getCell(2).getNumericCellValue());
            student.setAvgExamScore((float)currentRow.getCell(3).getNumericCellValue());
        }
        return students;
    }
}
