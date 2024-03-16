package Model;

public class CPModel {

    // ALPHABET string denotes alphabet from a-z
    public final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    // create encryptData() method for encrypting user input string with given shift key
    public String encryptData(String inputStr, int shiftKey)
    {
        // convert inputStr into lower case
        inputStr = inputStr.toLowerCase();

        // encryptStr to store encrypted data
        String encryptStr = "";

        // use for loop for traversing each character of the input string
        for (int i = 0; i < inputStr.length(); i++)
        {
            char encryptChar = ' ';
            if (inputStr.charAt(i) != ' ')
            {
                // get position of each character of inputStr in ALPHABET
                int pos = ALPHABET.indexOf(inputStr.charAt(i));

                // get encrypted char for each char of inputStr
                int encryptPos = (shiftKey + pos) % 26;
                encryptChar = ALPHABET.charAt(encryptPos);
            }
            // add encrypted char to encrypted string
            encryptStr += encryptChar;
        }

        // return encrypted string
        return encryptStr;
    }

    // create decryptData() method for decrypting user input string with given shift key
    public String decryptData(String inputStr, int shiftKey)
    {
        // convert inputStr into lower case
        inputStr = inputStr.toLowerCase();

        // decryptStr to store decrypted data
        String decryptStr = "";

        // use for loop for traversing each character of the input string
        for (int i = 0; i < inputStr.length(); i++)
        {
            char decryptChar = ' ';
            if (inputStr.charAt(i) != ' ' )
            {
                // get position of each character of inputStr in ALPHABET

                int pos = ALPHABET.indexOf(inputStr.charAt(i));

                // get decrypted char for each char of inputStr
                int decryptPos = (pos - shiftKey) % 26;

                // if decryptPos is negative
                if (decryptPos < 0){
                    decryptPos = ALPHABET.length() + decryptPos;
                }
                decryptChar = ALPHABET.charAt(decryptPos);
            }
            // add decrypted char to decrypted string
            decryptStr += decryptChar;
        }
        // return decrypted string
        return decryptStr;
    }
}
