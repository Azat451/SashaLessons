package HomeWork14.timeLups;

import java.util.Scanner;

public class BigTime {
    private Scanner sc;
    private int day;
    private int mouth;
    private int years;
    private boolean leapYear;

    public BigTime(){this.sc = new Scanner(System.in);}

    public BigTime(int day, int mouth, int years) {
        this.day = day;
        this.mouth = mouth;
        this.years = years;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31){
            switch (this.getMouth()){
                case 1 :
                    this.day = day;
                    break;
                case 2 :
                    if (this.leapYear) {
                        this.day = day;
                    }else if (day <= 28){
                        this.day = day;
                    }else {
                        day = setterDay();
                        this.setDay(day);
                    }
                    break;
                case 3 :
                    this.day = day;
                    break;
                case 4 :
                    if (day <= 30){
                        this.day = day;
                    }else {
                        day = this.setterDay();
                        this.setDay(day);
                    }
                    break;
                case 5 :
                    this.day = day;
                    break;
                case 6 :
                    if (day <= 30){
                        this.day = day;
                    }else {
                        day = setterDay();
                        this.setDay(day);
                    }
                    break;
                case 7 :
                    this.day = day;
                    break;
                case 8 :
                    this.day = day;
                    break;
                case 9 :
                    if (day <= 30){
                        this.day = day;
                    }else {
                        day = setterDay();
                        this.setDay(day);
                    }
                    break;
                case 10 :
                    this.day = day;
                    break;
                case 11 :
                    if (day <= 30){
                        this.day = day;
                    }else {
                        day = setterDay();
                        this.setDay(day);
                    }
                    break;
                case 12 :
                    this.day = day;
                    break;
                default: System.out.println("Что то пошло не так!");
            }
        }else {
            System.out.println("Некоректный день");
            System.out.println("Введите день обратно");
            day = this.sc.nextInt();
            this.setDay(day);
        }
    }

    public int getMouth() {
        return mouth;
    }

    public void setMouth(int mouth) {
        if (mouth >= 1 && mouth <= 12){
            this.mouth = mouth;
        }else {
            System.out.println("Некоретный месяц");
            System.out.print("Введите обратно - ");
            mouth = this.sc.nextInt();
            this.setMouth(mouth);
        }
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        if (years > 1939){
            if (years % 4 == 0){
                this.leapYear = true;
            }else this.leapYear = false;
            this.years = years;
        }else {
            System.out.println("Некоректный год");
            System.out.println("Введите год обратно");
            years = this.sc.nextInt();
            this.setYears(years);
        }
    }

    private int setterDay() {
        System.out.println("Некоректно введен день");
        System.out.println("Введите день снова");
        int day = this.sc.nextInt();
        return day;
    }

    public String toString() {
        return String.format("%s , Год: %s, Месяц: %s, День: %s",
                this.leapYear ? "Высокостный" : "Обычный",
                this.getYears(), this.getMouth(), this.getDay());
    }
}
