package HomeWork14.model;

import HomeWork14.timeLups.BigTime;

public class Students {
    private BigTime dataBerth;
    private String serName;
    private String name;
    private Boolean gender;
    private String genderWrite;
    private Integer age;

    public Students() {
    }

    public Students(BigTime dataBerth, String serName, String name, Boolean gender) {
        this.setDataBerth(dataBerth);
        this.setSerName(serName);
        this.setName(name);
        this.setGender(gender);
        this.setAge();
    }

    public Students(int day, int mouth, int years, String serName, String name, Boolean gender) {
        this.setDataBerth(day, mouth, years);
        this.setSerName(serName);
        this.setName(name);
        this.setGender(gender);
        this.setAge();
    }

    public String getDataBerth() {
        return this.dataBerth.toString();
    }

    public void setDataBerth(BigTime dataBerth) {
        this.dataBerth = dataBerth;
    }

    public void setDataBerth(int day, int mouth, int years) {
        this.dataBerth = new BigTime(day, mouth, years);
    }

    public String getSerName() {
        return this.serName;
    }

    public void setSerName(String serName) {
        this.serName = serName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGender() {
        return this.gender;
    }

    public void setGender(Boolean gender) {
        if (gender != null) {
            if (gender) {
                this.genderWrite = "Мужчина";
            } else {
                this.genderWrite = "Женщина";
            }

            this.gender = gender;
        } else {
            this.genderWrite = "Неопределился";
        }

    }

    public void setGender(String genderWrite) {
        this.genderWrite = genderWrite;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge() {
        this.age = 2022 - this.dataBerth.getYears();
    }

    public String toString() {
        return String.format("Студент: \nИмя: %s \nФамилия: %s" +
                " \nДата рождения: %s \nПол: %s \nВозраст: %s ",
                this.getName(), this.getSerName(), this.getDataBerth(), this.genderWrite, this.getAge());
    }
    //
}
