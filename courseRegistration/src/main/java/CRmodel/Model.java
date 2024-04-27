package CRmodel;

import CRview.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Model implements Observable {

    public HashMap<Integer, String> d_courses;

    public List<Observer> d_observer;

    String d_update;

    public Model() {
        d_courses = new HashMap<>();
        d_observer = new ArrayList<>();
    }

    public void addCourse(int p_id, String p_name) {
        d_courses.put(p_id, p_name);

        d_update = "Course added successfully.";

        notifyObservers();
    }

    public void deleteCourse(int p_edit_id) {

        if (d_courses.containsKey(p_edit_id)) {
            d_courses.remove(p_edit_id);
            d_update = "Course deleted successfully.";
            notifyObservers();
        } else {
            d_update = "Course ID does not exist.";
            notifyObservers();
        }
    }

    public void updateCourse(int p_id, String p_updated_course_name) {

        if (d_courses.containsKey(p_id)) {

            d_courses.put(p_id, p_updated_course_name);
            d_update = "Course updated successfully.";
            notifyObservers();
        } else {
            d_update = "Course ID does not exist.";
            notifyObservers();
        }
    }

    public boolean checkCourseExits(int p_course_id) {

        if (d_courses.containsKey(p_course_id)) {
            return true;
        } else {
            return false;
        }

    }

    public HashMap<Integer, String> getCourses() {
        return d_courses;
    }

    @Override
    public void registerObserver(Observer o) {

        d_observer.add(o);

    }

    @Override
    public void removeObserver(Observer o) {

        if (d_observer.contains(o)) {
            d_observer.remove(o);
        }

    }

    @Override
    public void notifyObservers() {

        for (Observer observer :
                d_observer) {
            observer.update(d_update);

        }

    }
}
