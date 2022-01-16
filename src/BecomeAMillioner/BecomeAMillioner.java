package BecomeAMillioner;

import java.util.Scanner;

public class BecomeAMillioner {
    private String question;
    private String answers;
    public String rightAnswer;
    public String looseAnswer;
    private int Ournum = 4000; // 4000 //first points,if points count equals == 0, game end and game start question //continue game or end game y/n
    private Scanner sc;

    public BecomeAMillioner(){

    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        int num = sc.nextInt();
        System.out.println("question1\n" +
                "1 - answer1\n" +
                "2 - answer2\n" +
                "3 - answer3\n" +
                "4 - answer4\n" +
                "Our Answer - " + num);
        String[] question1 = new String[4]; // Массив с ответами
        question1[0] = "answer1";
        question1[1] = "answer2";
        question1[2] = "answer3";
        question1[3] = "answer4";
         this.question = question1[num - 1];
         switch (question1[num - 1]){   // И логика с проверкой на ответы
             case "answer1" :  setLooseAnswer(looseAnswer);break;
             case "answer2" : setRightAnswer(rightAnswer);break;
             case "answer3" : setLooseAnswer(looseAnswer);break;
             case "answer4" : setLooseAnswer(looseAnswer);break;
         }
        System.out.println("question2\n" +
                "1 - answer1\n" +
                "2 - answer2\n" +
                "3 - answer3\n" +
                "4 - answer4\n" +
                "Our Answer - " + num);
        String[] question2 = new String[4]; // Массив с ответами
        question1[0] = "answer1";
        question1[1] = "answer2";
        question1[2] = "answer3";
        question1[3] = "answer4";
        this.question = question2[num - 1];

    }

//    public String getAnswers() {
//        return answers;
//    }
//
//    public void setAnswers(String answers) { // Это хернбю я написал с полуссоным видом.
//        // Мне стоит поработать с этим оссобенно с концом
//        if (answers.equals( true)){
//            Ournum = Ournum + 4000;
//            System.out.println("Это правильный ответ,вам добавлены ещё +4000 очков\n" +
//                    "У вас - " + Ournum);
//        }else {
//            Ournum = Ournum - 4000;
//            System.out.println("Это не правильный ответ, вы теряете -4000 очков\n" +
//                    "У вас - " + Ournum);
//            if (Ournum == 0){
//                System.out.println("Вы проиграли"); //while system out end, and(or) question continue;
//            }
//        }
//        this.answers = answers;
//    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        Ournum = Ournum - 2000;                        // Интересно так будет правильно
        System.out.println("Это был не правильный ответ, у вас отнимается -2000\n" +
                "У вас -" + Ournum);
        this.rightAnswer = rightAnswer;
    }

    public String getLooseAnswer() {
        return looseAnswer;
    }

    public void setLooseAnswer(String looseAnswer) {
        Ournum = Ournum + 4000;                             //Интересно а так будет правильно
        System.out.println("Вы правильно ответили, вам начисленны ещё +4000\n" +
                "У вас -" + Ournum);
        this.looseAnswer = looseAnswer;
    }
}
