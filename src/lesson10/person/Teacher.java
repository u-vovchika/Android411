package lesson10.person;

public class Teacher extends Human {
    private String speciality;
    private double rating;

    public Teacher(String lastName, String firstName, int age, String speciality, double rating) {
        super(lastName, firstName, age);
//        this.speciality = speciality;
//        this.rating = rating;
        setSpeciality(speciality);
        setRating(rating);
        System.out.println("TeacherConstructor\t" + Integer.toHexString(hashCode()));
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return super.toString() + " Teacher{" +
                "speciality='" + speciality + '\'' +
                ", rating=" + rating +
                '}';
    }
}
