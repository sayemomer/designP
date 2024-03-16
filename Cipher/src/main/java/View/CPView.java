package View;

import Model.CPModel;

public class CPView implements Observer{

    public void update(String cipheredString, String inputStr, int accumulatedKey, CPModel cpModel) {
        System.out.println("Encrypted Data ===> " + cipheredString);
        System.out.println("Decrypted Data ===> " + cpModel.decryptData(cpModel.encryptData(inputStr, accumulatedKey), accumulatedKey));
    }
}
