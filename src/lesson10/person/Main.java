package lesson10.person;

public class Main {
    public static void main(String[] args) {
        // экземпляр класса Human
        Human human = new Human(
                "Батодалеев",
                "Даши",
                16);
        System.out.println(human);


        // экземпляр класса Teacher
        Teacher teacher = new Teacher(
                "Козовякина",
                "Елена",
                18,
                "Программирование Java",
                100);
        System.out.println(teacher);


        // экземпляр класса Student новый
        Student student1 = new Student(
                human,
                "Физика",
                "Ф-23",
                0,
                0);
        System.out.println(student1);

        Student student = new Student(
                "Загидулин",
                "Линар",
                32,
                "Математика",
                "ММ_220",
                90,
                95);
        System.out.println(student);

        Graduat graduat1 = new Graduat(
                student,
                "Матемачические вычисления");
        System.out.println(graduat1);

        // экземпляр класса Graduat
        Graduat graduate = new Graduat(
                "Шугани",
                "Сергей",
                25,
                "Сети",
                "DS_11",
                88,
                90,
                "Защита");
        System.out.println(graduate);

        Specialist specialist = new Specialist(
                graduate,
                5);
        System.out.println(specialist);


    }
}
