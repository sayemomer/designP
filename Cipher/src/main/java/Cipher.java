// import required classes and package, if any
import java.util.Scanner;

import Controller.CPController;
import Model.CPModel;

// create class CaesarCipherExample for encryption and decryption
public class Cipher
{
    public static void main(String[] args)
    {
        CPController cpController = new CPController();
        cpController.go();
    }
}