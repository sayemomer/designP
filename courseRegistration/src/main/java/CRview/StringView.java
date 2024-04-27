package CRview;

import java.util.HashMap;

public class StringView implements AdvanceCourseView {
    @Override
    public void htmlView(HashMap<Integer, String> p_courses) {


    }

    @Override
    public void stringView(HashMap<Integer, String> p_courses) {
        System.out.println("Registered Courses:");
        p_courses.forEach((id, name) -> System.out.println("ID: " + id + ", Course: " + name));
    }
}
