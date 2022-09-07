/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author darrenl
 */
// Need help to get it to work
public class AnswerChecker {

    public static boolean checkAnswer(String answer, int currentLevel, boolean input, boolean currentStatus) throws FileNotFoundException {
            boolean response = false;
            
            // Setting Up Scanners And Files
            File Answers = new File("Data//Answers.txt");
            Scanner AnsSC = new Scanner(Answers);
            
            File LevelSaved = new File("Data//LevelSaved.txt");
            
            PrintWriter levelSaver = new PrintWriter(LevelSaved);

            String Ans = AnsSC.next();
            
          
            //Checking answer to see if it is right
            while (AnsSC.hasNextLine()) {
                    if(answer.equalsIgnoreCase(Ans)){
                        levelSaver.print(currentLevel);
                        response = true;
                        break;
                    
                    }
            }

return response;
    }

}