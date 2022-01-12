package HomeWork14.FullNameDeccan;

import java.util.Scanner;

public class FullNameDeccan {
    private String nameDeccan;
    private String serrNameDeccan;
    private String patronDeccan;
    private Scanner sc;

    public FullNameDeccan(Scanner name, Scanner serrName, Scanner patron){
        setNameDeccan(this.nameDeccan);
        setSerrNameDeccan(this.serrNameDeccan);
        setPatronDeccan(this.patronDeccan);
    }

    public String getNameDeccan() {
        return nameDeccan;
    }

    public void setNameDeccan(String nameDeccan) {
        System.out.print("Пожайста введите ваше Ф.И.О преподователя \n" +
                "- ");
        nameDeccan = sc.next();
        this.nameDeccan = nameDeccan;
    }

    public String getSerrNameDeccan() {
        return serrNameDeccan;
    }

    public void setSerrNameDeccan(String serrNameDeccan) {
        serrNameDeccan = sc.next();
        this.serrNameDeccan = serrNameDeccan;
    }

    public String getPatronDeccan() {
        return patronDeccan;
    }

    public void setPatronDeccan(String patronDeccan) {
        patronDeccan = sc.next();
        this.patronDeccan = patronDeccan;
    }

    public String toString(){
        return String.format("Ф.И.О преподователя - %s %s %s", getNameDeccan(), getSerrNameDeccan(), getPatronDeccan());
    }
}
