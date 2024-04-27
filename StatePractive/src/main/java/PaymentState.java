public class PaymentState implements Registration{

    private CourseRegistration courseRegistration;
    public PaymentState(CourseRegistration courseRegistration) {
        this.courseRegistration = courseRegistration;

    }

    @Override
    public void completePrerequisite() {

    }

    @Override
    public void makePayment() {
        System.out.println("Payment completed.");
        courseRegistration.setState(new RegistrationState(courseRegistration));

    }

    @Override
    public void registerCourse() {

    }
}
