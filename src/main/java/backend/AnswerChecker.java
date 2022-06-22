/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author darrenl
 */
// Need help to get it to work
public class AnswerChecker implements Runnable {

    JTextField jtf;

    public AnswerChecker(JTextField in) {
        jtf = in;
    }

    @Override
    public void run() {

        try {
            File Answers = new File("Answers//Answers.txt");

            Scanner AnsSC = new Scanner(Answers);

            String Ans = AnsSC.next();

            while (AnsSC.hasNextLine()) {
                if(jtf == Ans){
                   
                }
            }


        } 

        catch (FileNotFoundException e) {

        }
    }

}