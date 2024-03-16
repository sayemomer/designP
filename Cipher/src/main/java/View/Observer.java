package View;

import Model.CPModel;

public interface Observer {
    void update(String cipheredString, String inputStr, int accumulatedKey, CPModel cpModel);
}

