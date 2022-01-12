package HomeWork14.NamesAndGender;

import java.util.Random;

public class NamesAndGender {
    private String name;
    private String sername;
    private String patron;
    private String gender;
    private String man;
    private String woman;
    private Random rand = new Random();

    public NamesAndGender(){
        setName(name);
        setSername(sername);
        setPatron(patron);
        setGender(gender);
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        int num;
        while (true) {
            num = rand.nextInt(9 - 1 + 1) + 1;
            switch (num) {
                case 1 : this.name = "Азамат ";break; // муж
                case 2 : this.name = "Джасмин ";break; // женск
                case 3 : this.name = "Артур ";break; // муж
                case 4 : this.name = "Катя ";break; // женск
                case 5 : this.name = "Ария ";break; // женск
                case 6 : this.name = "Настя ";break; // женск
                case 7  : this.name = "Алексей ";break; // муж
                case 8  : this.name = "Густав ";break; // муж
                case 9  : this.name = "Тататьяна ";break; // женск
                case 10  : this.name = "Иван ";break; // муж
            }
        }
//        this.name = name;
    }

    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        int num;
        while (true){
            num = rand.nextInt(9 - 1 + 1) + 1;
            switch (num) {
                case 1 : this.sername = "Каморов ";break;
                case 2 : this.sername = "Сергеев ";break;
                case 3 : this.sername = "Полынин ";break;
                case 4 : this.sername = "Берюзов ";break;
                case 5 : this.sername = "Ван Хельсинг ";break;
                case 6 : this.sername = "Минор ";break;
                case 7 : this.sername = "Дальников ";break;
                case 8 : this.sername = "Залупин ";break;
                case 9 : this.sername = "Керинков ";break;
                case 10 : this.sername = "Радищев ";break;
            }
        }
//        this.sername = sername;
    }

    public String getPatron() {
        return patron;
    }

    public void setPatron(String patron) {
        int num;
        while (true){
            num = rand.nextInt(9 - 1 + 1) + 1;
            switch (num){
                case 1 : this.patron = "Маратович ";break;
                case 2 : this.patron = "Имеренко ";break;
                case 3 : this.patron = "Владимирович ";break;
                case 4 : this.patron = "Петров ";break;
                case 5 : this.patron = "Олегов ";break;
                case 6 : this.patron = "Георгович ";break;
                case 7 : this.patron = "Никитыч ";break;
                case 8 : this.patron = "Генадиевич ";break;
                case 9 : this.patron = "Грегорович ";break;
                case 10 : this.patron = "Алескандров ";break;
            }
        }
//        this.patron = patron;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (name.equals("Джасмин") || name.equals("Катя") ||
                name.equals("Ария") || name.equals("Настя") || name.equals("Тататьяна")){
            this.gender = "Мужской";
        }else {
            this.gender = "Женский";
        }
//        this.gender = gender;
    }
}
