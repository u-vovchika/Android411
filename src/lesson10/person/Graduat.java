package lesson10.person;

public class Graduat extends Student{
    private String subject;

    public Graduat(String lastName,
                   String firstName,
                   int age,
                   String speciality,
                   String group,
                   double rating,
                   double attendance,
                   String subject) {
        super(lastName, firstName, age, speciality, group, rating, attendance);
        //this.subject = subject;
        setSubject(subject);
        System.out.println("SraduatConsnructor\t" + Integer.toHexString(hashCode()) );
    }

    public Graduat(Student student, String subject){
        super(student);
        setSubject(subject);
        System.out.println("SraduatConsnructor\t" + Integer.toHexString(hashCode()) );
    }

    public Graduat(Graduat other){
        super(other);
        this.subject = other.subject;

    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() + "Graduate{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
