package SkillFactoryProjects.UniversityStudentsProject.XlsIO;

import SkillFactoryProjects.UniversityStudentsProject.MainCode.Statistics;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class XlsWriter {
    private XlsWriter() {}

    @SuppressWarnings("resource")
    public void writeXlsStatistics(List<Statistics> statisticsList, String filePath) throws IOException {
        // Creating Workbook
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        XSSFSheet xssfSheet = xssfWorkbook.createSheet("Statistics");

        // Workbook Customisation
        Font headerFont = xssfWorkbook.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 14);
        CellStyle headerStyle = xssfWorkbook.createCellStyle();
        headerStyle.setFont(headerFont);

        // Customising the Rows
        int rowNumber = 0;
        Row headerRow = xssfSheet.createRow(rowNumber++);

        // Study Profile
        Cell profileCellHeader = headerRow.createCell(0);
        profileCellHeader.setCellValue("Study Profile");
        profileCellHeader.setCellStyle(headerStyle);

        // Average Exam Score
        Cell avgScoreCellHeader = headerRow.createCell(1);
        avgScoreCellHeader.setCellValue("Study Profile Average Exam Score");
        avgScoreCellHeader.setCellStyle(headerStyle);

        // Study Profile Number of Students
        Cell numberOfStudentsCellHeader = headerRow.createCell(2);
        numberOfStudentsCellHeader.setCellValue("Study Profile Number of Students");
        numberOfStudentsCellHeader.setCellStyle(headerStyle);

        // Study Profile Number of Universities
        Cell numberOfUniversitiesCellHeader = headerRow.createCell(3);
        numberOfUniversitiesCellHeader.setCellValue("Study Profile Number of Universities");
        numberOfUniversitiesCellHeader.setCellStyle(headerStyle);

        // University Names
        Cell universitiesCellHeader = headerRow.createCell(4);
        universitiesCellHeader.setCellValue("Universities");
        universitiesCellHeader.setCellStyle(headerStyle);

        // Statistics
        for (Statistics statistics : statisticsList) {
            Row dataRow = xssfSheet.createRow(rowNumber++);

            // Study Profile
            Cell profileCell = dataRow.createCell(0);
            profileCell.setCellValue(statistics.getStudyProfile().getProfileName());

            // Average Exam Score
            Cell avgScoreCell = dataRow.createCell(1);
            avgScoreCell.setCellValue(statistics.getAverageExamScore());

            // Study Profile Number of Students
            Cell numberOfStudentsCell = dataRow.createCell(2);
            numberOfStudentsCell.setCellValue(statistics.getStudentsInStudyProfile());

            // Study Profile Number of Universities
            Cell numberOfUniversitiesCell = dataRow.createCell(3);
            numberOfUniversitiesCell.setCellValue(statistics.getStudyProfileUniversities());

            // University Names
            Cell universitiesCell = dataRow.createCell(4);
            universitiesCell.setCellValue(statistics.getUniversityName());
        }

        // File Output
        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath)) {
            xssfWorkbook.write(fileOutputStream);
        }
    }
}
