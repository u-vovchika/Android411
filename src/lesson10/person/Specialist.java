package lesson10.person;

//// наследуется от Graduate (по диплому получил 5)
public class Specialist extends Graduat {
    private int grade;

    public Specialist(
            String lastName,
            String firstName,
            int age,
            String speciality,
            String group,
            double rating,
            double attendance,
            String subject,
            int grade) {
        super(lastName, firstName, age, speciality, group, rating, attendance, subject);
        this.grade = grade;
    }

    public Specialist(Graduat graduat, int grade){
        super(graduat);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString() + " Specialist{" +
                "grade=" + grade +
                '}';
    }
}
