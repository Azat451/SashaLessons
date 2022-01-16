package BecomeAMillioner;

import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        String answer = sc.next();
        int num = 4000;
        System.out.println("question1\n" +
                "1 - answer1\n" +
                "2 - answer2\n" +
                "3 - answer3\n" +
                "4 - answer4\n" +
                "Our Answer - " + answer);
        switch (answer){
            case "answer1" :
                num = num - 2000;
                System.out.println("Это был не правильный ответ, у вас отнимается -2000\n" +
                        "У вас -" + num);
                break;
            case "answer2" :
                num = num + 4000;
                System.out.println("Вы правильно ответили, вам начисленны ещё +4000\n" +
                        "У вас -" + num);
                break;
            case "answer3" :

        }
    }
}
