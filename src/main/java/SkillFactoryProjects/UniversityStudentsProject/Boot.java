package SkillFactoryProjects.UniversityStudentsProject;

import SkillFactoryProjects.UniversityStudentsProject.Comparators.Student.StudentComparator;
import SkillFactoryProjects.UniversityStudentsProject.Comparators.University.UniversityComparator;
import SkillFactoryProjects.UniversityStudentsProject.Enums.StudentComparatorTypes;
import SkillFactoryProjects.UniversityStudentsProject.Enums.UniversityComparatorTypes;
import SkillFactoryProjects.UniversityStudentsProject.Model.Info;
import SkillFactoryProjects.UniversityStudentsProject.Model.Statistics;
import SkillFactoryProjects.UniversityStudentsProject.Model.Student;
import SkillFactoryProjects.UniversityStudentsProject.Model.University;
import SkillFactoryProjects.UniversityStudentsProject.Readers.XlsReader;
import SkillFactoryProjects.UniversityStudentsProject.Util.StatisticsUtil;
import SkillFactoryProjects.UniversityStudentsProject.Util.UtilClass;
import SkillFactoryProjects.UniversityStudentsProject.Writers.JsonWriter;
import SkillFactoryProjects.UniversityStudentsProject.Writers.XlsWriter;
import SkillFactoryProjects.UniversityStudentsProject.Writers.XmlWriter;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

@SuppressWarnings({"unused"})
public class Boot {
    public static void main(String[] args) {
        // Logger
        Logger logger = Logger.getLogger(Boot.class.getName());

        // Logger Configuration
        try {
            LogManager.getLogManager().readConfiguration(Boot.class.getResourceAsStream("/logging.properties"));
        } catch (IOException ioException) {
            logger.log(Level.CONFIG, "Logger Configuration Error: " + ioException.getMessage());
        }

        logger.log(Level.INFO, "Application started, Logger configured");

        List<University> universities =
                XlsReader.readXlsUniversities("src/main/resources/universityInfo.xlsx");
        UniversityComparator universityComparator =
                UtilClass.getUniversityComparator(UniversityComparatorTypes.YEAR_OF_FOUNDATION);
        universities.sort(universityComparator);

        List<Student> students =
                XlsReader.readXlsStudents("src/main/resources/universityInfo.xlsx");
        StudentComparator studentComparator =
                UtilClass.getStudentComparator(StudentComparatorTypes.AVG_EXAM_SCORE);
        students.sort(studentComparator);

        List<Statistics> statisticsList = StatisticsUtil.createStatistics(students, universities);
        XlsWriter.writeXlsStatistics(statisticsList, "statistics.xlsx");

        Info info = new Info()
                .setStudentList(students)
                .setUniversityList(universities)
                .setStatisticsList(statisticsList)
                .setProcessDate(new Date());

        // Writing to XML && JSON
        XmlWriter.generateXmlReq(info);
        JsonWriter.writeJsonReq(info);

        logger.log(Level.INFO, "Application Finished The Process");
    }
}
