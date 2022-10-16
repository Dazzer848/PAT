/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

//Importing all dependancys.
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author darrenl
 */
public class AnswerChecker {
    
    //Mehtod to check weather the inputted answer is correct or the same as the answers stored in permenant storage (Answers.txt)
    public static boolean checkAnswer(String Inpuutedanswer, boolean cap,int level)throws FileNotFoundException{
        
        //Setting up variables
        
        //IF the answer is correct
        boolean result = false;
        
        //If the check needs to be Caps sensitive
        boolean capResult = false;
        boolean nocapResult = false;

        String answer = "";
        
        //Scannes the answers stored in permenant storage (Answers.txt)
        Scanner answerScannner = new Scanner(new File("Data//Puzzles//Answers//Answers.txt"));
        PrintWriter levelSaverwriter = new PrintWriter(new File("Data//LevelSaved.txt"));

        
      //Scans each answer and each time the scanner moves the level increases due to it being the next answer.
        for(int i = 0; i < level;i++){
            if(answerScannner.hasNextLine()){
                answer = answerScannner.nextLine();
            }
        }
        
        //If not caps sensitive check answer
        if(cap && answer.equalsIgnoreCase(Inpuutedanswer)){
            levelSaverwriter.print(level);
            levelSaverwriter.flush();
            result  = true;
            return result;
        }
        
        //If it is caps sensitive check answer
        else if(answer.equals(Inpuutedanswer)){
            levelSaverwriter.print(level);
            levelSaverwriter.flush();
            result = true;
            return result;
        }
        
        //return reult. True = User got the answer correct. False = the user got the answer wron.
        return result;
    }

}
  