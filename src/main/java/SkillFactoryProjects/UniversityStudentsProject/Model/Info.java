package SkillFactoryProjects.UniversityStudentsProject.Model;

import javax.xml.bind.annotation.*;
import java.util.Date;
import java.util.List;

@SuppressWarnings("unused")
@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class Info {
    @XmlElementWrapper(name = "studentsInfo")
    @XmlElement(name = "studentEntry")
    private List<Student> studentList;

    @XmlElementWrapper(name = "universitiesInfo")
    @XmlElement(name = "universityEntry")
    private List<University> universityList;

    @XmlElementWrapper(name = "statisticalInfo")
    @XmlElement(name = "statisticsEntry")
    private List<Statistics> statisticsList;

    @XmlElement(name = "processedAt")
    private Date processDate;

    public Info() {
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public Info setStudentList(List<Student> studentList) {
        this.studentList = studentList;
        return this;
    }

    public List<University> getUniversityList() {
        return universityList;
    }

    public Info setUniversityList(List<University> universityList) {
        this.universityList = universityList;
        return this;
    }

    public List<Statistics> getStatisticsList() {
        return statisticsList;
    }

    public Info setStatisticsList(List<Statistics> statisticsList) {
        this.statisticsList = statisticsList;
        return this;
    }

    public Date getProcessDate() {
        return processDate;
    }

    public Info setProcessDate(Date processDate) {
        this.processDate = processDate;
        return this;
    }
}
