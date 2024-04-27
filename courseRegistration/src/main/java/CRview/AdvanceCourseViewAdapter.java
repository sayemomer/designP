package CRview;

import java.util.ArrayList;
import java.util.HashMap;

public class AdvanceCourseViewAdapter {

     AdvanceCourseView courseView;

    public AdvanceCourseViewAdapter(String p_outputType) {

        if (p_outputType.equalsIgnoreCase("HTML")){
            courseView = new HTMLView();
        }
        if (p_outputType.equalsIgnoreCase("String")){
            courseView = new StringView();
        }
    }

    public void view(String p_outputType , HashMap<Integer, String> p_courses){

        if (p_outputType.equalsIgnoreCase("HTML")){
            courseView.htmlView(p_courses);
        }
        if (p_outputType.equalsIgnoreCase("String")){
            courseView.stringView(p_courses);
        }

    }
}
