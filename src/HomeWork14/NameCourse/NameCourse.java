package HomeWork14.NameCourse;

import java.util.Scanner;

public class NameCourse {
    //Если ты читаешь пожайлуста не суди строго, я пытался сделать то чего нельзя делать
    /**
     * Есть разные курсы поэтому нужно выбрать один из них и
     * при вызове курсов надо первым же делом запрашивать какой декан относится той или иной курсам
     */
    private String name;
    private String engener;
    private String programmer;
    private String designer;
    Scanner sc = new Scanner(System.in);

    public NameCourse(Scanner nameCourse) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.print("Пожайста выберите курс который вам нужен\n" +
                "*Курс Инженерий - 1\n" +
                "*Курс Программирований - 2\n" +
                "*Курс Дизайнера - 3\n" +
                "- " );
        int num = sc.nextInt();
        if (num == 1){
            name = "Курс Инженерий";
            this.name = name;
            setEngener(engener);
        }
        if (num == 2){
            name = "Курс Программирований";
            this.name = name;
            setProgrammer(programmer);
        }
        if (num == 3){
            name = "Курс Дизайнера";
            this.name = name;
            setDesigner(designer);
        }
//        Если при вызове мы нажмем на один из трех чисел выйдет та или иная ветка
    }
    public void setEngener(String engener) {
        System.out.print("Выберите ветки направлений инженера\n" +
                "*Инженер биомедик - 1\n" +
                "*Инжнер химик - 2\n" +
                "*Строительный инженер - 3\n" +
                "- ");
        int num = sc.nextInt();
        switch (num){
            case 1 : System.out.println("\nИнженер-биомедик");break;
            case 2 : System.out.println("\nИнженер-химик");break;
            case 3 : System.out.println("\nСтроительный инженер");break;
        }
        // Пристрелите меня!
    }
    public void setProgrammer(String programmer){
        System.out.print("Выберите ветки направлений програмиста\n" +
                "*Back-end developers - 1\n" +
                "*Front-end developers - 2\n" +
                "*Full-stack developers - 3\n" +
                "- ");
        int num = sc.nextInt();
        switch (num){
            case 1 : System.out.println("\nBack-end developers");break;
            case 2 : System.out.println("\nFront-end developers");break;
            case 3 : System.out.println("\nFull-stack developers");break;
        }
    }
    public void setDesigner(String designer){
        System.out.print("Выберите ветки направлений дизайнера\n" +
                "*Дизайнер одежды - 1\n" +
                "*Веб-разработчик(ДИзайнер сайтов) - 2\n" +
                "*Гейм-дизайнер - 3\n" +
                "- ");
        int num = sc.nextInt();
        switch (num){
            case 1 : System.out.println("\nДизайнер одежды");break;
            case 2 : System.out.println("\nВеб-разработчик");break;
            case 3 : System.out.println("\nГейм-дизайнер");break;
        }
    }

    public String getEngener() {
        return engener;
    }

    public String getProgrammer() {
        return programmer;
    }

    public String getDesigner() {
        return designer;
    }

    public String toString(){
        return String.format("%s",getName());
    }

}
 /**
  * Есть разные отрасли поэтому надо разделить на какой будет находится
  * курсы: Инженер,It-разработка,Дизайнер
  * Инженеры:
  * Инженер-биомедик
  * Строительный инженер
  *
  * Программисты:
  * Back-end developers
  * Front-end developers
  * Full-stack developers
  *
  * Дизайнеры:
  * Дизайнер одежды
  * Веб-разработчик
  * Гейм-дизайнер
  */