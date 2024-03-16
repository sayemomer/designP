package Controller;

import Model.CPModel;
import Model.Subject;
import View.CPView;
import View.Observer;

import java.util.ArrayList;
import java.util.Scanner;

public class CPController implements Subject {

    int accumulatedKey = 0;

    private String cipheredString;

    String inputStr;

    CPModel cpModel;

    CPView cpView;

    ArrayList<Observer> observers = new ArrayList<Observer>();

    public CPController() {
        cpModel = new CPModel();
        cpView = new CPView();
        attach(cpView);
    }

    public void go()
    {
        // create an instance of Scanner class
        Scanner sc = new Scanner(System.in);
        char another;

        // take input from the user
        System.out.println("Enter a string for encryption using Caesar Cipher: ");
        inputStr = sc.nextLine();
        cipheredString = inputStr;
        int shiftKey = 0;
        do
        {
            System.out.println("\nEnter the value by which each character in the plaintext message gets shifted: ");
            shiftKey = Integer.valueOf(sc.nextLine());
            accumulatedKey += shiftKey;

            cipheredString = cpModel.encryptData(cipheredString, shiftKey);
            notifyObservers();

            // close Scanner class object
            System.out.print("\nEncrypt further? (y/n)?");
            another = sc.nextLine().charAt(0);
        } while( another == 'y' );
        sc.close();
    }

    @Override
    public void attach(Observer observer) {
        //attach observer
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        //remove observer
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        //notify observer
        for (Observer observer : observers) {
            observer.update(cipheredString, inputStr, accumulatedKey, cpModel);
        }
    }
}
