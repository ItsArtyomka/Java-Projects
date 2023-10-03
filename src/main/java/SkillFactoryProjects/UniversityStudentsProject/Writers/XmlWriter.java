package SkillFactoryProjects.UniversityStudentsProject.Writers;

import SkillFactoryProjects.UniversityStudentsProject.Model.Info;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class XmlWriter {
    private static final Logger logger = Logger.getLogger(XmlWriter.class.getName());

    private XmlWriter() {
    }

    public static void generateXmlReq(Info fullInfo) {

        try {
            logger.log(Level.INFO, "XML Marshalling Started...");

            JAXBContext jaxbContext = JAXBContext.newInstance(Info.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            try {
                Files.createDirectory(Paths.get("xmlReqs"));
                logger.log(Level.INFO, "Directory Created.");
            } catch (IOException exception) {
                logger.log(Level.FINE, "Directory Already Exists: " + exception.getMessage(), exception);
            }
            File requestFile = new File("xmlReqs/infoReq" + new Date().getTime() + ".xml");

            marshaller.marshal(fullInfo, requestFile);
        } catch (JAXBException exception) {
            logger.log(Level.SEVERE, "XML Marshalling Failed: " + exception.getMessage(), exception);
            return;
        }

        logger.log(Level.INFO, "XML Marshalling Finished.");
    }
}
