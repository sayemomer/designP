package CRview;

import CRmodel.Model;

import java.util.HashMap;

public class View implements Observer{

    private Model d_courseModel;

    public HashMap<Integer, String> courses;

    public View(Model p_model) {
        d_courseModel = p_model;
        d_courseModel.registerObserver(this);
        courses = d_courseModel.getCourses();

    }

    public void view(String p_outputType) {

        AdvanceCourseViewAdapter advanceCourseViewAdapter;

        if(p_outputType.equalsIgnoreCase("String")){
            System.out.println("Registered Courses:");
            courses.forEach((id, name) -> System.out.println("ID: " + id + ", Course: " + name));
        }
        if (p_outputType.equalsIgnoreCase("HTML")){

            advanceCourseViewAdapter = new AdvanceCourseViewAdapter("HTML");
            advanceCourseViewAdapter.view("HTML",courses);
        }

    }

    @Override
    public void update(String p_notification) {

        System.out.println(p_notification);

    }
}
