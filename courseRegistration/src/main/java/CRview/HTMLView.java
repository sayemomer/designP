package CRview;

import java.util.HashMap;

public class HTMLView implements AdvanceCourseView {
    @Override
    public void htmlView(HashMap<Integer, String> p_courses) {

        System.out.println("<html> <h1>Registered Courses:</h1>");
        p_courses.forEach((id, name) -> System.out.println(" <ul> ID: " + id + ", Course: </ul> " + name));

    }

    @Override
    public void stringView(HashMap<Integer, String> p_courses) {

    }
}
