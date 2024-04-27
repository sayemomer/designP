public class RegistrationState implements Registration{

    private CourseRegistration courseRegistration;
    public RegistrationState(CourseRegistration courseRegistration) {
        this.courseRegistration = courseRegistration;
    }

    @Override
    public void completePrerequisite() {

    }

    @Override
    public void makePayment() {


    }

    @Override
    public void registerCourse() {
        System.out.println("Student " + " is registered in course " + "Java Programming");
        courseRegistration.setState(new PrerequisiteState(courseRegistration));
    }
}
