package lesson10.person;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(
                "Батодалеев",
                "Даши",
                16);
        System.out.println(human);

        Student student = new Student(
                "Загидулин",
                "Линар",
                32,
                "Математика",
                "ММ_220",
                90,
                95);
        System.out.println(student);

        Teacher teacher = new Teacher(
                "Козовякина",
                "Елена",
                18,
                "Программирование Java",
                100);
        System.out.println(teacher);

    }
}
