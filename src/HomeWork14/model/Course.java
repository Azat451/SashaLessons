package HomeWork14.model;

import HomeWork14.NameCourse.NameCourse;

import java.util.Scanner;

public class Course {
    private String nameCourse;
    private String dataCreate;
    private Long id;
    private String nameDecan;
    private String serrNameDeacan;
    private String patronDecan;
    private Scanner sc = new Scanner(System.in);

    public Course() {
    }

    public Course(Scanner nameDecan,Scanner serrNameDecan,Scanner patronDecan,Scanner nameCourse,String dataCreate, Long id) {
        setNameDecan(this.nameDecan);
        setSerrNameDeacan(this.serrNameDeacan);
        setPatronDecan(this.patronDecan);
        setNameCourse(this.nameCourse);
        this.dataCreate = dataCreate;
        this.id = id;
    }

        public String getNameCourse() {
        return this.nameCourse;
    }

    //Запрашивает у вас какой курс вам не обходим
    public void setNameCourse(String nameCourse) {
        System.out.print("Пожайста выберите курс который вам нужен\n" +
                "*Курс Инженерий - 1\n" +
                "*Курс Программирований - 2\n" +
                "*Курс Дизайнера - 3\n" +
                "- " );
        int num = sc.nextInt();
        switch (num){
            case 2 : nameCourse = "Курс Программирований"; this.nameCourse = nameCourse;break;
            case 1 : nameCourse = "Курс Инженерий"; this.nameCourse = nameCourse;break;
            case 3 : nameCourse = "Курс Дизайнера";this.nameCourse = nameCourse;break;
        }
    }


    public String getDataCreate() {
        return this.dataCreate;
    }

    public void setDataCreate(String dataCreate) {
        this.dataCreate = dataCreate;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameDecan() {
        return this.nameDecan;
    }

    public void setNameDecan(String nameDecan) {
        System.out.print("Пожайста введите ваше Ф.И.О преподователя \n" +
                "- ");
        nameDecan = sc.next();
        this.nameDecan = nameDecan;
    }

    public String getSerrNameDeacan() {
        return serrNameDeacan;
    }

    public void setSerrNameDeacan(String serrNameDeacan) {
        serrNameDeacan = sc.next();
        this.serrNameDeacan = serrNameDeacan;
    }

    public String getPatronDecan() {
        return patronDecan;
    }

    public void setPatronDecan(String patronDecan) {
        patronDecan = sc.next();
        this.patronDecan = patronDecan;
    }

    public String toString() {
        return String.format("%s\n" +
                "%s - Дата создание\n" +
                "ID-%s\n " +
                "Ф.И.О преподователя - %s %s %s",this.getNameCourse(),this.getDataCreate(),this.getId(),
                this.getNameDecan(),this.getSerrNameDeacan(),this.getPatronDecan());
    }

}
