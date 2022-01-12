package HomeWork14.model;

import java.util.Arrays;

public class Group {
    private Students[] allStudents;
    private Course course;
    private String dateStart;
    private Integer mouthStady;

    public Group() {
    }

    public Group(Students[] allStudents, Course course, String dateStart, Integer mouthStady) {
        this.setAllStudents(allStudents);
        this.setCourse(course);
        this.setDateStart(dateStart);
        this.setMouthStady(mouthStady);
    }

    public Students[] getAllStudents() {
        return this.allStudents;
    }

    public void setAllStudents(Students[] allStudents) {
        this.allStudents = allStudents;
    }

    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getDateStart() {
        return this.dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public Integer getMouthStady() {
        return this.mouthStady;
    }

    public void setMouthStady(Integer mouthStady) {
        this.mouthStady = mouthStady;
    }

    public String toString() {
        String var10000 = Arrays.toString(this.allStudents);
        return "Group{allStudents=" + var10000 + ", course=" + this.course + ", dateStart='" + this.dateStart + "', mouthStady=" + this.mouthStady + "}";
    }
}
