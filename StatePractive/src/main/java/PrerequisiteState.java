public class PrerequisiteState implements Registration {
    private CourseRegistration courseRegistration;

    public PrerequisiteState(CourseRegistration courseRegistration) {
        this.courseRegistration = courseRegistration;
    }

    @Override
    public void completePrerequisite() {
        System.out.println("Prerequisites completed.");
        courseRegistration.setState(new PaymentState(courseRegistration));
    }

    @Override
    public void makePayment() {
        System.out.println("Cannot make payment. Prerequisites not completed.");
    }

    @Override
    public void registerCourse() {
        System.out.println("Cannot register. Prerequisites not completed.");
    }
}