package HomeWork14.testHomeWork14;

import HomeWork14.FullNameDeccan.FullNameDeccan;
import HomeWork14.NameCourse.NameCourse;
import HomeWork14.model.Course;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        FullNameDeccan fullNameDeccan = new FullNameDeccan(sc.reset(),sc.reset(),sc.reset());
        NameCourse nameCourse = new NameCourse(sc.reset());
//        Course course = new Course(sc.reset(),"17:00 - 18:00",123645L);
        System.out.println(nameCourse);

    }
}
