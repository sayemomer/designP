package SCView;

import SCModel.Observable;

public interface Observer {

    public void update(Observable p_observable_state);
}

