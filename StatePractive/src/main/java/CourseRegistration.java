public class CourseRegistration {

    private String studentName;
    private String courseName;
    private Registration registration;

    public CourseRegistration(String studentName, String courseName) {

        this.studentName = studentName;
        this.courseName = courseName;
        this.registration = new PrerequisiteState(this);

    }

    public void setState(Registration registration) {
        this.registration = registration;

    }

    public void makePayment() {
          registration.makePayment();
        }

    public void completePrerequisite() {
        registration.completePrerequisite();

    }

    public void registerCourse() {
        registration.registerCourse();

    }

    public static void main(String[] args) {
        CourseRegistration courseRegistration = new CourseRegistration("John", "Java Programming");
        courseRegistration.makePayment();
        courseRegistration.completePrerequisite();
        courseRegistration.makePayment();
        courseRegistration.registerCourse();
    }
}
