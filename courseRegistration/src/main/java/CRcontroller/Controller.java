package CRcontroller;

import CRmodel.Model;
import CRview.View;

import java.util.Scanner;

public class Controller {

    private Scanner scanner;
    private Model d_courseModel;
    private View d_courseView;

    public Controller() {
        scanner = new Scanner(System.in);
        d_courseModel = new Model();
        d_courseView = new View(d_courseModel);


    }

    public void start() {
        boolean running = true;

        while (running) {
            System.out.println("Course Registration System");
            System.out.println("1. Add Course");
            System.out.println("2. Delete Course");
            System.out.println("3. Update Course");
            System.out.println("4. View Courses");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter course ID: ");
                    int l_id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter course name: ");
                    String l_name = scanner.nextLine();
                    d_courseModel.addCourse(l_id, l_name);

                    break;
                case 2:

                    System.out.print("Enter course ID to delete: ");
                    int l_edit_id = scanner.nextInt();


                    d_courseModel.deleteCourse(l_edit_id);

                    break;
                case 3:

                    System.out.print("Enter course ID to update: ");
                    int l_update_id = scanner.nextInt();

                    if (d_courseModel.checkCourseExits(l_update_id)) {
                        System.out.print("Enter new course name: ");
                        String l_updated_name = scanner.nextLine();
                        d_courseModel.updateCourse(l_update_id, l_updated_name);
                    } else {
                        System.out.println("Course ID does not exits!");
                    }

                    break;
                case 4:
                    d_courseView.view("String");
                    d_courseView.view("HTML");
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please enter a valid number.");
            }
        }

        scanner.close();
    }
}
