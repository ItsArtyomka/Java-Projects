package SkillFactoryProjects.UniversityStudentsProject.Writers;

import SkillFactoryProjects.UniversityStudentsProject.Model.Info;
import SkillFactoryProjects.UniversityStudentsProject.Util.JsonUtil;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JsonWriter {
    private static final Logger logger = Logger.getLogger(JsonWriter.class.getName());

    private JsonWriter() {
    }

    public static void writeJsonReq(Info info) {

        logger.log(Level.INFO, "JSON writing started");

        try {
            Files.createDirectory(Paths.get("jsonReqs"));
            logger.log(Level.INFO, "Directory created successfully");
        } catch (IOException ioEx) {
            logger.log(Level.FINE, "Directory already created", ioEx);
        }

        writeStudents(info);
        writeUniversities(info);
        writeStatisticsList(info);

        logger.log(Level.INFO, "JSON writing finished successfully");
    }

    private static void writeStudents(Info info) {
        String studentsJson = JsonUtil.writeListToJson(info.getStudentList());
        try (FileOutputStream outputStream = new FileOutputStream("jsonReqs/students" + info.getProcessDate().getTime() + ".json")) {
            outputStream.write(studentsJson.getBytes(StandardCharsets.UTF_8));
        } catch (IOException exception) {
            logger.log(Level.SEVERE, "Students JSON writing failed", exception);
        }
    }

    private static void writeUniversities(Info info) {
        String universitiesJson = JsonUtil.writeListToJson(info.getUniversityList());
        try (FileOutputStream outputStream = new FileOutputStream("jsonReqs/universities" + info.getProcessDate().getTime() + ".json")) {
            outputStream.write(universitiesJson.getBytes(StandardCharsets.UTF_8));
        } catch (IOException exception) {
            logger.log(Level.WARNING, "Universities JSON Writing Failed: ", exception);
        }
    }

    private static void writeStatisticsList(Info fullInfo) {
        String studentsJson = JsonUtil.writeListToJson(fullInfo.getStatisticsList());
        try (FileOutputStream outputStream = new FileOutputStream("jsonReqs/statistics" + fullInfo.getProcessDate().getTime() + ".json")) {
            outputStream.write(studentsJson.getBytes(StandardCharsets.UTF_8));
        } catch (IOException exception) {
            logger.log(Level.WARNING, "Statistics JSON Writing Failed", exception);
        }
    }
}
