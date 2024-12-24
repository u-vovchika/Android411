package Lesson11.student_DZ;


public class Main {
    public static void main(String[] args) {

        Students a[] = new Students[3];

        a[0] = new Student();
        a[1] = new Aspirant1();
        a[2] = new Aspirant2();

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i].first());
            System.out.print(a[i].last());
            System.out.print(a[i].group());
            System.out.print(a[i].tema());
            System.out.print(a[i].summa());
            System.out.print(a[i].salary());
            System.out.println();
        }

    }
}


class Students {
    public String first() {
        return "";
    }

    public String last() {
        return "";
    }

    public String group() {
        return "";
    }

    public String tema() {
        return "";
    }

    public String summa() {
        return "";
    }

    public static double base = 1000;

    public double salary() {
        return base;
    }
}


class Student extends Students {

    @Override
    public String first() {
        return "Виктор ";
    }

    @Override
    public String last() {
        return "Вербов, ";
    }

    @Override
    public String group() {
        return "группа Gr111, ";
    }

    @Override
    public String summa() {
        return "сумма стипендии: ";
    }

    @Override
    public double salary() {
        int z = 5;  // оценка студента
        if (z == 5)
            return base;
        return base - 200;
    }
}


class Aspirant1 extends Students {

    @Override
    public String first() {
        return "Александр ";
    }

    @Override
    public String last() {
        return "Невзоров, ";
    }

    @Override
    public String group() {
        return "группа Gr222, ";
    }

    @Override
    public String tema() {
        return "тема работы: 'Work1, ";
    }

    @Override
    public String summa() {
        return "сумма стипендии: ";
    }

    @Override
    public double salary() {
        int z = 5;  // оценка аспиранта 1
        if (z == 5)
            return base + 1000;
        return base;
    }
}


class Aspirant2 extends Students {

    @Override
    public String first() {
        return "Антон ";
    }

    @Override
    public String last() {
        return "Бобров, ";
    }

    @Override
    public String group() {
        return "группа Gr333, ";
    }

    @Override
    public String tema() {
        return "тема работы: 'Work2, ";
    }

    @Override
    public String summa() {
        return "сумма стипендии: ";
    }

    @Override
    public double salary() {
        int z = 4;  // оценка аспиранта 2
        if (z == 5)
            return base + 1000;
        return base;
    }
}