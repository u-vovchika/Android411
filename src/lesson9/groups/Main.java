package lesson9.groups;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        Student student[] = new Student[n];
        student[0] = new Student("Петров", "А.В", 1);
        student[1] = new Student("Петров", "В.И", 1);
        student[2] = new Student("Иванов", "А.К", 1);
        student[3] = new Student("Вербова", "В.С", 2);
        student[4] = new Student("Долгих", "Л.С", 2);
        student[5] = new Student("Шишкин", "И.И", 3);
        student[6] = new Student("Матрешкина", "А.В", 3);
        student[7] = new Student("Волков", "П.В", 3);
        student[8] = new Student("Колганов", "А.Б", 3);
        student[9] = new Student("Репкин", "Д.В", 3);

        Random rd = new Random();
        for (int i = 0; i < student.length; i++) {
            for (int j = 0; j < student.length; j++) {
                student[i].addGrade(rd.nextInt(12) + 1);
            }

        }

        System.out.println("Все студенты: ");
        for (int i = 0; i < student.length; i++) {
            student[i].print();

        }
        System.out.println("\nСтуденты с хорошей успеваемостью: ");
        for (int i = 0; i < student.length; i++) {
            if(student[i].isGood()){
                student[i].print();
            }
        }
    }
}
