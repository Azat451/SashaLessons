package HomeWork14.model;

import java.util.Arrays;

public class Lesson {
    private String dataRun;
    private Students[] studyStudents;
    private Course course;
    private String LessonsStart;
    private Boolean homeWorks;
    private Boolean examWorks;

    public Lesson() {
    }

    public String getDataRun() {
        return this.dataRun;
    }

    public void setDataRun(String dataRun) {
        this.dataRun = dataRun;
    }

    public Students[] getStudyStudents() {
        return this.studyStudents;
    }

    public void setStudyStudents(Students[] studyStudents) {
        this.studyStudents = studyStudents;
    }

    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getLessonsStart() {
        return this.LessonsStart;
    }

    public void setLessonsStart(String lessonsStart) {
        this.LessonsStart = lessonsStart;
    }

    public Boolean getHomeWorks() {
        return this.homeWorks;
    }

    public void setHomeWorks(Boolean homeWorks) {
        this.homeWorks = homeWorks;
    }

    public Boolean getExamWorks() {
        return this.examWorks;
    }

    public void setExamWorks(Boolean examWorks) {
        this.examWorks = examWorks;
    }

    public String toString() {
        String var10000 = this.dataRun;
        return "Lesson{dataRun='" + var10000 + "', studyStudents=" + Arrays.toString(this.studyStudents) + ", course=" + this.course + ", LessonsStart='" + this.LessonsStart + "', homeWorks=" + this.homeWorks + ", examWorks=" + this.examWorks + "}";
    }
}
